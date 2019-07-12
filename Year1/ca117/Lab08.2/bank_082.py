class BankAccount(object):
    next_account_number = 16555232
    total_lodgements = 0
    interest_rate = 0.043
    total_lodgements = 0

    def __init__(self, fname, sname, balance=0):
        self.fname = fname
        self.sname = sname
        self.balance = balance
        self.account_number = BankAccount.next_account_number
        BankAccount.next_account_number += 1

    def __str__(self):
        return "Name: {}\nAccount number: {}\nBalance: {:.2f}".format(self.fname + " " + self.sname,
                                                                      self.account_number,
                                                                      self.balance)

    def lodge(self, amount):
        self.balance += amount
        BankAccount.total_lodgements += 1

    def apply_interest(self):
        self.balance += self.balance * BankAccount.interest_rate

    def __iadd__(self, other):
        self.lodge(other)
        return self
