class BankAccount(object):
    account_number = 16555232
    account_type = 'General'

    def __init__(self, forename, surname, balance):
        self.forename = forename
        self.surname = surname
        self.balance = float(balance)
        self.account_number = BankAccount.account_number
        BankAccount.account_number += 1

    def __str__(self):
        l = []
        l.append('Name: {:s}'.format(self.forename + ' ' + self.surname))
        l.append('Account number: {:d}'.format(self.account_number))
        l.append('Account type: {:s}'.format(self.account_type))
        l.append('Balance: {:.2f}'.format(self.balance))
        return '\n'.join(l)

    def lodge(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        new_balance = self.balance - amount
        if new_balance < 0:
            print('Insufficient funds available')
        else:
            self.balance -= amount


class CurrentAccount(BankAccount):
    overdraft = -1000.00
    account_type = 'Current'

    def withdraw(self, amount):
        new_balance = self.balance - amount
        if new_balance < self.overdraft:
            print('Insufficient funds available')
        else:
            self.balance -= amount

    def __str__(self):
        l = []
        l.append(super().__str__())
        l.append('Overdraft: {:.2f}'.format(self.overdraft))
        return '\n'.join(l)


class SavingsAccount(BankAccount):
    interest_rate = 0.01
    account_type = 'Savings'

    def apply_interest(self):
        interest = self.balance * self.interest_rate
        self.balance += interest

    def __str__(self):
        l = []
        l.append(super().__str__())
        l.append('Interest rate: {:.2f}'.format(self.interest_rate))
        return '\n'.join(l)
