# ######################################
# Andrew Finn
# 18XXXXXX
# andrew.finn8mail.dcu.ie
# ######################################
# The Sleeping Barber

import os
import random
import time
from threading import Thread, Lock, Event

mutex = Lock()

ARRIVAL_WAIT = 1.5
MAX_CUT_TIME = 10


class BarberShop:
    queue = []

    def __init__(self, barbers, seats=10):
        self.barbers = barbers
        self.seats = seats
        print('Barber Shop is open for business with {} available seat(s) and {} barber(s)'.format(self.seats,
                                                                                                   len(self.barbers)))

    def open_shop(self):
        print('9AM: The barber shop is now open for business')
        for barber in self.barbers:
            barber = Thread(target=self.haircut, args=(barber,))
            barber.start()

    def new_customer(self, customer):
        mutex.acquire()
        cus_num = 0
        print('{} has entered the barber shop '.format(customer.name), end="")
        if len(self.queue) == self.seats:
            print(' but the queue is full, {} is now leaving'.format(customer.name))
            mutex.release()
        else:
            self.queue.append(customer.name)
            mutex.release()
            self.barbers[cus_num % 3].wake()
            print('and has joined the queue [{}/{}]'.format(len(self.queue), self.seats))
            cus_num += 1

    def haircut(self, barber):
        while True:
            mutex.acquire()
            if len(self.queue) == 0:
                print('Queue is empty, {} is going to sleep'.format(barber.name))
                mutex.release()
                barber.sleeping()

            else:
                curr_cus = self.queue[0]
                del self.queue[0]
                mutex.release()
                barber.cut_hair(curr_cus)

    def is_empty(self):
        return len(BarberShop.queue) == 0


class Customer:
    def __init__(self, name):
        self.name = name


class Barber:
    working_barber = Event()

    def __init__(self, name):
        self.name = name

    def wake(self):
        self.working_barber.set()

    def sleeping(self):
        self.working_barber.wait()

    def cut_hair(self, customer):
        self.working_barber.clear()
        print('--> {} is cutting {}\'s hair'.format(self.name, customer))
        time.sleep(random.randint(0, MAX_CUT_TIME))
        print('--> {} has finish cutting {}\'s hair, {} is now leaving.'.format(self.name, customer,
                                                                                customer))


def setup(num_barbers, num_customers, num_seats):
    barber_list = []
    for i in range(1, num_barbers + 1):
        barber_list.append(Barber("Barber{}".format(i)))
    barbershop = BarberShop(barber_list, seats=num_seats)
    barbershop.open_shop()

    customers = ['Jack', 'James', 'Daniel', 'Conor', 'Sean', 'Adam', 'Noah', 'Michael', 'Charlie', 'Luke', 'Thomas',
                 'OYouisin', 'Alex', 'Cian', 'Harry', 'Patrick', 'Dylan', 'Ryan', 'Fionn', 'Liam', 'Darragh', 'Cillian',
                 'David', 'Jamie', 'Jake', 'Aaron', 'Matthew', 'John', 'Ben', 'Finn', 'Oliver', 'Nathan', 'Tadhg',
                 'Kyle', 'Evan', 'Rian', 'Tom', 'Sam', 'Mason', 'Ethan', 'Samuel', 'Joseph', 'Callum', 'Max', 'Oscar',
                 'Alexander', 'Eoin', 'Joshua', 'Jacob', 'Bobby', 'William', 'Aidan', 'Leo', 'Leon', 'Robert', 'Ronan',
                 'Senan', 'Benjamin', 'Logan', 'Andrew', 'Jayden', 'Alfie', 'Tommy', 'Ciaran', 'Mark', 'Cathal',
                 'Ollie', 'Danny', 'Odhrán', 'Donnacha', 'Eoghan', 'Shane', 'Rory', 'Scott', 'Peter', 'Dara', 'Isaac',
                 'Shay', 'Billy', 'Kai', 'Tyler', 'Lucas', 'Anthony', 'Henry', 'Martin', 'Christopher', 'Kevin',
                 'Lorcan', 'Cormac', 'George', 'Hugo', 'Tomas', 'Dáithí', 'Josh', 'Brian', 'Edward', 'Sebastian',
                 'Killian', 'Ruairí', 'Dáire', 'Luca', 'Rhys', 'Kian', 'Jakub', 'Jonathan', 'Zach', 'Daragh', 'Kacper',
                 'Hugh', 'Colin', 'Craig', 'Richard', 'Owen', 'Connor', 'Tristan', 'Darren', 'Denis', 'Patryk',
                 'Philip', 'Simon', 'Filip', 'Gerard', 'Karl', 'Eric', 'Seamus', 'Brendan', 'Shaun', 'Steven', 'Marcus',
                 'Keith', 'Dillon', 'Glen', 'Szymon', 'Barry', 'Declan', 'Emmet', 'Jordan', 'Donal', 'Ian', 'Gary',
                 'Neil', 'Emmanuel', 'Kayden', 'Paul', 'Calum']

    for c in range(num_customers):
        name = random.choice(customers) + " " + random.choice(["Murphy", "Kelly", "Walsh", "Smith", "O’Brien", "Ryan"])
        c = Customer(name)
        barbershop.new_customer(c)
        time.sleep(ARRIVAL_WAIT * random.random())
    print(" ***** All customers are in the shop or have been turned away *****")
    while not barbershop.is_empty():
        time.sleep(3)

    time.sleep(MAX_CUT_TIME)
    print("Queue is empty, all barbers are asleep and the barber shop is now  closed for the day\nGoodbye")
    os._exit(1)


if __name__ == '__main__':
    b = int(input("How many barbers would you like: "))
    c = int(input("How many customers would you like: "))
    s = input("How many seats would you like(Blank for INF): ")  # Number of customer = seats therefor infinite in
    # practise
    if not s:
        s = c
    else:
        s = int(s)
    setup(num_barbers=b, num_customers=c, num_seats=s)
