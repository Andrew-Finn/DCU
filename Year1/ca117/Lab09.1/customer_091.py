class Customer:
    discount = 0

    def __init__(self, name, balance, addr_line1, addr_line2, addr_line3):
        self.name = name
        self.balance = balance
        self.addr_line1 = addr_line1
        self.addr_line2 = addr_line2
        self.addr_line3 = addr_line3

    def __str__(self):
        return "{}\n{}\n{}\n{}\nBalance: {:.2f}\nDiscount: {}%\nAmount due: {:.2f}".format(self.name,
                                                                                           self.addr_line1,
                                                                                           self.addr_line2,
                                                                                           self.addr_line3,
                                                                                           self.balance,
                                                                                           self.discount,
                                                                                           self.owes())

    def owes(self):
        return self.balance * (100 - self.discount) / 100


class ValuedCustomer(Customer):
    discount = 10
