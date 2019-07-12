class BankAccount(object):
    def __init__(self, balance=0):
        self.balance = int(balance)

    def withdraw(self, amount):
        if self.balance - int(amount) >= 0:
            self.balance -= int(amount)
        else:
            print("Insufficient funds available")

    def deposit(self, amount):
        self.balance += int(amount)

    def __str__(self):
        return "Your current balance is: {:.2f} euro".format(self.balance)
