class Stack:
    def __init__(self):
        self.l = []

    def __len__(self):
        return len(self.l)

    def push(self, val):
        self.l.append(val)

    def pop(self):
        return self.l.pop()

    def top(self):
        return self.l[-1]

    def is_empty(self):
        return len(self.l) == 0
