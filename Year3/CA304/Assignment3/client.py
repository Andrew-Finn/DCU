import socket
import sys
import threading

HOST = ""
PORT = 0
NICKNAME = ""
ROOM = "main"
MY_ID = ""


def receive():
    """This thread is responsible for all the data the client receive it can parse commands and then send the
    requested data to the server such as a Nickname or can print incoming messages if it is not a command.
    """
    global ROOM, MY_ID
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if message.startswith("!"):
                if message.startswith("!nickname"):
                    client.send(NICKNAME.encode('ascii'))
                elif message.startswith("!id"):
                    t = message.split(":")
                    MY_ID = t[1]
            else:
                if len(message) != 0:
                    print(message)

        except Exception as e:
            print(e)
            print("An error occurred!")
            client.close()
            break


def write():
    """This thread is responsible for all the data the client send it can parse commands and then send the request to
    the server for processing such as to request a name change or change room etc. or can format and send a users
    message to the server for distribution.
    """
    global ROOM, MY_ID, NICKNAME
    while True:
        inp = input('')
        if inp.startswith("!"):
            if inp.startswith("!join "):
                inp = inp.split(" ")
                join = inp[1].lower()
                ROOM = join
                print("Requesting to join channel '{}'".format(join))
                join = "!join:" + join
                client.send(join.encode('ascii'))
            elif inp.startswith("!nick "):
                inp = inp.split(" ")
                if len(inp) != 2:
                    print("Error please try again and use format !nick JohnDoe")
                nick = inp[1].lower()
                print("Requesting to change nickname to '{}'".format(nick))
                NICKNAME = nick
                client.send(("!nick:" + NICKNAME).encode('ascii'))
            elif inp.startswith("!broadcast "):
                message = inp[11:]
                client.send(("!broadcast" + ":" + message).encode("ascii"))
            else:
                print("Command not found")
        else:
            message = '{}: {}'.format(NICKNAME, inp)
            client.send(message.encode('ascii'))


if __name__ == '__main__':
    """Parses and checks command line arguments, connects to the given server and spins of the receiving and sending 
    threads.   
    """
    if len(sys.argv) != 4:
        print("Error missing/extra parameters\n -> clients.py <nickname> <ip_address>, <port>")
        sys.exit(0)
    try:
        socket.inet_aton(sys.argv[2])
    except socket.error:
        print("'{}' is not a valid IPv4 address".format(sys.argv[2]))
    if not (0 < int(sys.argv[3]) < 65535):
        print("'{}' is not a valid IPv4 port".format(sys.argv[3]))
        sys.exit(0)

    NICKNAME = sys.argv[1]
    HOST = sys.argv[2]
    PORT = int(sys.argv[3])

    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect((HOST, PORT))
    receive_thread = threading.Thread(target=receive)
    write_thread = threading.Thread(target=write)
    receive_thread.start()
    write_thread.start()
