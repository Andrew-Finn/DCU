# Andrew Finn - 18XXXXXX - andrew.finn8@mail.dcu.ie
"""
This example module shows various types of documentation available for use
with pydoc.  To generate HTML documentation for this module issue the
command:

    pydoc -w foo

"""
# Format <"First 0 index"> -> [<"class letter">, <network>, <HOST>, <first address>, <last address>]
ip_class = {0: ["A", 2 ** 7, 2 ** 24, "0.0.0.0", "127.255.255.255"],
            # 00000000.00000000.00000000.00000000 -> 01111111.11111111.11111111.11111111
            1: ["B", 2 ** 14, 2 ** 16, "128.0.0.0", "191.255.255.255"],
            # 10000000.00000000.00000000.00000000 -> 10111111.11111111.11111111.11111111
            2: ["C", 2 ** 21, 2 ** 8, "192.0.0.0", "223.255.255.255"],
            # 11000000.00000000.00000000.00000000 -> 11011111.11111111.11111111.11111111
            3: ["D", "N/A", "N/A", "224.0.0.0", "239.255.255.255"],
            # 11100000.00000000.00000000.00000000 -> 11101111.11111111.11111111.11111111
            4: ["E", "N/A", "N/A", "240.0.0.0", "247.255.255.255"]
            # 11110000.00000000.00000000.00000000 -> 11110111.11111111.11111111.11111111
            }


# I am showing the decimal addresses above to show how they are calculated, converting these addresses to decimal will
# give the correct address range. I have chosen instead to save the address as decimal and pre calculated in a
# dictionary as lookup is linear and as such has a complexity of N(1) which would is quicker than calculating the
# addresses each time.

# ------------ Helper functions ------------
# All credit to assigment spec.
def to_binary_string(ip_addr):
    """
    Converts an ip address represented as a string in decimal dot notation into a list of four binary strings each
    representing one byte of the address

    Parameters:
    ip_addr: The ip address as a string in decimal dot notation
    e.g. "132.206.19.7"

    Returns:
    An array of four binary strings each representing one byte of ip_addr
    e.g.  ['10000100', '11001110', '00010011', '00000111']
    """
    byte_split = ip_addr.split(".")
    return ['{0:08b}'.format(int(x)) for x in byte_split]


# All credit to assigment spec.
def to_decimal_dot(ip_addr_list):
    """
    Take in an array of four strings representing the bytes of an ip address and convert it back into decimal dot notation

    Parameters:
    ip_addr_list: An array of four binary strings each representing one byte of ip_addr
    e.g.['10000100', '11001110', '00010011', '00000111']

    Returns:
    The ip address as a string in decimal dot notation
    e.g.'132.206.19.7'
    """
    return ".".join([str(int(x, 2)) for x in ip_addr_list])


# ------------ Assigment functions ------------
def get_class_stats(ip_addr):
    """
    A function which takes an ip address identifies its class and returns stats based on that address and its class.

    Parameters:
    ip_addr (str): String of the ip to be processed in the form XXX.XXX.XXX.XXX

    Returns:
    Various stats on the provided ip address as a string in the following form:
    string: "Class: {} Network: {} Host: {} First address: {} Last address: {}"
    """
    return "Class: {}\nNetwork: {}\nHost: {}\nFirst address: {}\nLast address: {}\n".format(
        *ip_class[to_binary_string(ip_addr)[0].find("0")])


sub_offset = {"A": -3,
              "B": -2,
              "C": -1}


def get_subnet_stats(ip_addr, subnet_mask):
    """
    A function which takes an ip address and subnet mask and identifies stats such as cidr address and broadcast addresses.

    Parameters:
    ip_addr (str): String of the ip to be inputted in the form XXX.XXX.XXX.XXX
    subnet_mask (str): String of the subnet_mask to be inputted in the form XXX.XXX.XXX.XXX

    Returns: Various stats on the provided ip address and subnet as a string in the following form: string:"'Address:
    {} Subnets: {} Addressable hosts per subnet: {} Valid subnets: [{}] Broadcast addresses: [{}] First addresses:[{
    }] Last addresses:[{}]\"
    """
    net_class = ip_class[to_binary_string(ip_addr)[0].find("0")][0]
    cidr = ".".join(to_binary_string(subnet_mask)).count("1")
    cidr_addr = ip_addr + "/" + str(cidr)
    subnet = 2 ** ("".join(to_binary_string(subnet_mask))[sub_offset[net_class] * 8:].count("1"))
    num_addr = (2 ** ("".join(to_binary_string(subnet_mask))[sub_offset[net_class] * 8:].count("0"))) - 2
    subnet_temp, broadcast_temp, first_temp, last_temp = [[ip_addr for i in range(subnet)] for j in range(4)]
    subnet_addr, broadcast_addr, first_addr, last_addr = [[] for i in range(4)]
    for addr_i in range(subnet):
        # Subnet Addr
        tmp_adrr = subnet_temp[addr_i].split(".")
        tmp_adrr[sub_offset[net_class]] = (256 // subnet) * addr_i
        subnet_addr.append(".".join([str(octet) for octet in tmp_adrr]))
        #  Broadcast Addr
        tmp_adrr = broadcast_temp[addr_i].split(".")
        tmp_adrr[sub_offset[net_class]] = ((256 // subnet) * (addr_i + 1)) - 1
        if net_class == "A":
            tmp_adrr[-1] = 255
            tmp_adrr[-2] = 255
        if net_class == "B":
            tmp_adrr[-1] = 255
        broadcast_addr.append(".".join([str(octet) for octet in tmp_adrr]))
        # First Addr
        tmp_adrr = first_temp[addr_i].split(".")
        tmp_adrr[sub_offset[net_class]] = ((256 // subnet) * addr_i) + 1
        if net_class == "A":
            tmp_adrr[-1] = 1
            tmp_adrr[-2] = 1
            tmp_adrr[-3] -= 1
        if net_class == "B":
            tmp_adrr[-1] = 1
            tmp_adrr[-2] -= 1
        first_addr.append(".".join([str(octet) for octet in tmp_adrr]))
        # Last Addr
        tmp_adrr = last_temp[addr_i].split(".")
        tmp_adrr[sub_offset[net_class]] = ((256 // subnet) * (addr_i + 1)) - 2
        if net_class == "A":
            tmp_adrr[-1] = 254
            tmp_adrr[-2] = 256
            tmp_adrr[-3] -= 1
        if net_class == "B":
            tmp_adrr[-1] = 254
            tmp_adrr[-2] += 1
        last_addr.append(".".join([str(octet) for octet in tmp_adrr]))

    return 'Address: {}\nSubnets: {}\nAddressable hosts per subnet: {}\nValid subnets: {}\nBroadcast addresses:{}\n' \
           'First addresses:{}\nLast addresses:{}\n'.format(cidr_addr, subnet, num_addr, subnet_addr, broadcast_addr,
                                                            first_addr, last_addr)


def get_supernet_stats(ip_addrs):
    """
    A function which takes an ip address and subnet mask and identifies stats such as cidr address and broadcast addresses.

    Parameters:
    ip_addr (list): List of the ips to be inputted in the form [XXX.XXX.XXX.XXX, ...]

    Returns:
    CIDR Address and network mask in the form:
    string: "Address: {} Network Mask: {}"
    """

    binary_addrs = ["".join(to_binary_string(ip)) for ip in ip_addrs]
    match = ""
    for i in range(31):
        curr = binary_addrs[0][i]
        for ip_addr in binary_addrs:
            if ip_addr[i] != curr:
                match = binary_addrs[0][:i - 1]
                break
    mask = (len(match) * "1") + ((32 - len(match)) * "0")
    cidr = ".".join(mask).count("1")
    mask = to_decimal_dot([mask[i:i + 8] for i in range(0, 32, 8)])
    return "Address: {}/{}\nNetwork Mask: {}".format(ip_addrs[0], cidr, mask)


# Test cases for PyTest
def test_answer():
    assert get_class_stats("0.0.0.0") == "Class: A\nNetwork: 128\nHost: 16777216\nFirst address: 0.0.0.0\nLast " \
                                         "address: 127.255.255.255\n"
    assert get_class_stats("128.0.0.0") == "Class: B\nNetwork: 16384\nHost: 65536\nFirst address: 128.0.0.0\nLast " \
                                           "address: 191.255.255.255\n"
    assert get_class_stats("192.0.0.0") == "Class: C\nNetwork: 2097152\nHost: 256\nFirst address: 192.0.0.0\nLast " \
                                           "address: 223.255.255.255\n"
    assert get_class_stats("224.0.0.0") == "Class: D\nNetwork: N/A\nHost: N/A\nFirst address: 224.0.0.0\nLast " \
                                           "address: 239.255.255.255\n"
    assert get_class_stats("240.0.0.0") == "Class: E\nNetwork: N/A\nHost: N/A\nFirst address: 240.0.0.0\nLast " \
                                           "address: 247.255.255.255\n"
    assert get_class_stats("136.206.18.7") == "Class: B\nNetwork: 16384\nHost: 65536\nFirst address: 128.0.0.0\nLast " \
                                              "address: 191.255.255.255\n"  # Spec Example
    assert get_class_stats("224.192.16.5") == "Class: D\nNetwork: N/A\nHost: N/A\nFirst address: 224.0.0.0\nLast " \
                                              "address: 239.255.255.255\n"  # Spec Example

    assert get_subnet_stats("192.168.10.0",
                            "255.255.255.192") == "Address: 192.168.10.0/26\nSubnets: 4\nAddressable hosts per " \
                                                  "subnet: 62\nValid subnets: ['192.168.10.0', '192.168.10.64', " \
                                                  "'192.168.10.128', '192.168.10.192']\nBroadcast addresses:[" \
                                                  "'192.168.10.63', '192.168.10.127', '192.168.10.191', " \
                                                  "'192.168.10.255']\nFirst addresses:['192.168.10.1', " \
                                                  "'192.168.10.65', '192.168.10.129', '192.168.10.193']\nLast " \
                                                  "addresses:['192.168.10.62', '192.168.10.126', '192.168.10.190', " \
                                                  "'192.168.10.254']\n"  # Spec Example
    assert get_subnet_stats("172.16.0.0",
                            "255.255.192.0") == "Address: 172.16.0.0/18\nSubnets: 4\nAddressable hosts per subnet: " \
                                                "16382\nValid subnets: ['172.16.0.0', '172.16.64.0', '172.16.128.0', " \
                                                "'172.16.192.0']\nBroadcast addresses:['172.16.63.255', " \
                                                "'172.16.127.255', '172.16.191.255', '172.16.255.255']\nFirst " \
                                                "addresses:['172.16.0.1', '172.16.64.1', '172.16.128.1', " \
                                                "'172.16.192.1']\nLast addresses:['172.16.63.254', '172.16.127.254', " \
                                                "'172.16.191.254', '172.16.255.254']\n"  # Spec Example

    assert get_supernet_stats(["205.100.0.0", "205.100.1.0", "205.100.2.0",
                               "205.100.3.0"]) == "Address: 205.100.0.0/22\nNetwork Mask: 255.255.252.0"


if __name__ == '__main__':
    print(help(get_class_stats))
    print(help(get_subnet_stats))
    print(help(get_supernet_stats))
