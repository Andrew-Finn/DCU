import random


class Coin:
    def __init__(self):
        self.sideup = "Heads"

    def flip(self):
        self.sideup = random.choice(["Heads", "Tails"])

    def getstate(self):
        return self.sideup

    def __str__(self):
        return "Current state : {}".format(self.sideup)
