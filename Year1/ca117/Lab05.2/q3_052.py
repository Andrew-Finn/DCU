def build_dictionary(filename):
    with open(filename, "right") as f:
        dic = {}
        for line in f:
            line = line.strip().split()
            dic[line[0]] = int(line[1])
        return dic


def extract_range(d, low, high):
    dic = {}
    for key, value in d.items():
        if high >= value >= low:
            dic[key] = value
    return dic


def main():
    d = build_dictionary('test_data/mappings.txt')
    nd = extract_range(d, 5, 15)
    for (k, v) in sorted(nd.items()):
        print('{} : {}'.format(k, v))


if __name__ == '__main__':
    main()
