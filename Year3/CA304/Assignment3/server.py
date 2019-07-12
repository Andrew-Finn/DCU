import socket
import sys
import threading
import time
import uuid


class Client:
    """Basic class which stores basic information about a singular
    Parameters:
        client (socket<client>): stores an instance of a client socket
        nickname (str): store the client nickname

        + uuid (uuid/str): a unique uuid used to identify a client
   """

    def __init__(self, client, nickname):
        self.client_id = uuid.uuid4()
        self.client = client
        self.nickname = nickname

    def send(self, message):
        """A method of a Client that given a message will send that message to a given client
        Parameters:
            message ('ascii' str): the message to be sent encoded in ascii
       """
        self.client.send(message)


class Rooms:
    """The back bone of the server, Rooms holds all clients as well as various methods to interact with one or many
    of them
    Parameters:
        + clients (dict) : in the form client_id(uuid/str) = Client<class>
        + rooms (dict) : in the form room(str) = [client_id(s)(uuid/str)]
    """

    def __init__(self):
        self.clients = {}
        self.rooms = {"main": set()}

    def add(self, client, nickname):
        """Will add the given client to the class
        Parameters:
            client (client<class>): The client to be added
            nickname (str): The nickname of the client to be added
       """
        c = Client(client, nickname)
        self.clients[c.client_id] = c
        self.rooms["main"].add(c.client_id)
        return c.client_id

    def change_room(self, client, old_room, new_room, client_id):
        """Will move a given client from old_room to new_room and creates the room if it doesn't exist
        Parameters:
            client (client<class>): The client to be moved
            old_room (str): the name of the room the client is originating from
            new_room (str): the name of the room the client wants to go to
            client_id (str/uuid): the client of the client to be moved
        """
        self.rooms[old_room].remove(client_id)
        if new_room not in self.rooms:
            self.rooms[new_room] = set()
        self.rooms[new_room].add(client_id)
        client.send("*****Switching to chatroom '{}'*****\n".format(new_room).encode('ascii'))
        if old_room != "main" and len(self.rooms[old_room]) == 0:
            del self.rooms[old_room]

    def all_clients(self):
        """Will return a list of all client ids on the server currently
        Returns:
            l (list) = A list of all client uuids(str,uuid>
        """
        l = []
        for values in self.rooms.values():
            for value in values:
                l.append(value)
        return l

    def remove(self, client_id, room):
        """Will remove a clients records from the server
        Parameters:
            client_id (client<class>): The client_id to be removed
            room (str): The clients last room name
        """
        del self.clients[client_id]
        self.rooms[room].remove(client_id)

    def broadcast(self, message):
        """Will send a message to every client on the server regardless of room
        Parameters:
            message ('ascii' str): the message to be sent encoded in ascii
        """
        for cid in self.all_clients():
            self.clients[cid].send(message)

    def broadcast_room(self, message, room):
        """Will send a message to every client in a given room
        Parameters:
            message ('ascii' str): the message to be sent encoded in ascii
            room (str): the name of the channel the message will be sent
        """
        for cid in self.all_clients():
            try:
                if cid in self.rooms[room]:
                    self.clients[cid].send(message)
            except KeyError:
                pass


# This is not in a class in case you used it to automate testing etc so i left it outside of the class :)
def broadcast(message):
    CLIENTS.broadcast(message.encode("ascii"))


def client_thread(client, my_id):
    """Each client will be assigned of these clients threads it is a infinite loop that will responds to a clients
    message and commands forwarding them and responding to them accordingly.
    """
    my_room = "main"
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if not message.startswith("!"):
                print("{} [{}] '{}'".format(CLIENTS.clients[my_id].nickname, my_room, message))
                CLIENTS.broadcast_room(message.encode('ascii'), my_room)

            else:
                if message.startswith("!join:"):
                    cmd = message.split(":")
                    print(CLIENTS.clients[my_id].nickname, "joining room", cmd[1])
                    CLIENTS.broadcast_room('{} left!'.format(CLIENTS.clients[my_id].nickname).encode('ascii'), my_room)
                    time.sleep(.5)
                    CLIENTS.change_room(client, my_room, cmd[1], my_id)
                    my_room = cmd[1]
                    CLIENTS.broadcast_room('{} joined!'.format(CLIENTS.clients[my_id].nickname).encode('ascii'),
                                           my_room)
                elif message.startswith("!nick:"):
                    cmd = message.split(":")
                    old = CLIENTS.clients[my_id].nickname
                    CLIENTS.clients[my_id].nickname = cmd[1]
                    print('{} is now known as {}'.format(old, CLIENTS.clients[my_id].nickname))
                    CLIENTS.broadcast_room(
                        '{} is now known as {}\n'.format(old, CLIENTS.clients[my_id].nickname).encode('ascii'), my_room)
                elif message.startswith("!broadcast:"):
                    msg = message.split(":")
                    broadcast("[BROADCAST] {} : {}".format(CLIENTS.clients[my_id].nickname, msg[1]))
                    print("{} [{}] '{}'".format(CLIENTS.clients[my_id].nickname, my_room, message))

                else:
                    CLIENTS.broadcast_room(message.encode('ascii'), my_room)

        except Exception as e:
            CLIENTS.remove(my_id, my_room)
            CLIENTS.broadcast_room('{} left!\n'.format(CLIENTS.clients[my_id].nickname).encode('ascii'), my_room)
            print("Client left:", CLIENTS.clients[my_id].nickname, my_id, "(", e, ")")
            break


def new_client_receiver():
    """This function is again an infite loops, it waits for a new connection, then creates a client<class>,
    adds them to the CLIENTS class, spins off a new thread (client_thread()) to deal with that client and wait for a
    new connection
    """
    while True:
        client, address = server.accept()
        print("Connection started from {}:{}".format(address[0], address[1]))
        client.send('!nickname'.encode('ascii'))
        my_nickname = client.recv(1024).decode('ascii')
        my_id = CLIENTS.add(client, my_nickname)
        client.send("!id:{}".format(my_id).encode('ascii'))
        time.sleep(.5)
        CLIENTS.broadcast_room("{} joined!\n".format(my_nickname).encode('ascii'), "main")
        client.send("Connected to server!\n".encode('ascii'))
        client.send("*****Switching to chatroom 'Main'*****\n".encode('ascii'))
        client.send(
            "->Use !join <NAME> to join a room,\n->!nick <Name> to change your nickname,\n->!broadcast <Message> to "
            "send a message to all rooms".encode('ascii'))

        print("New client connected: Nickname: {}, IP: {}:{}, UUID: {}".format(my_nickname, address[0], address[1],
                                                                               my_id))
        thread = threading.Thread(target=client_thread, args=(client, my_id))
        thread.start()


HOST = ''
PORT = 0
CLIENTS = Rooms()

if __name__ == '__main__':
    """Parses and checks command line arguments and starts the server   
    """
    if len(sys.argv) != 3:
        print("Error missing/extra parameters\n -> server.py <ip_address>, <port>")
        sys.exit(0)
    try:
        socket.inet_aton(sys.argv[1])
    except socket.error:
        print("'{}' is not a valid IPv4 address".format(sys.argv[1]))
        sys.exit(0)
    if not (0 < int(sys.argv[2]) < 65535):
        print("'{}' is not a valid IPv4 port".format(sys.argv[2]))
        sys.exit(0)

    HOST = sys.argv[1]
    PORT = int(sys.argv[2])
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind((HOST, PORT))
    server.listen()
    print("Server started on {}:{}".format(HOST, PORT))
    new_client_receiver()
