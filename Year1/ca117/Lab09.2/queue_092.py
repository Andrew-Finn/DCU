class Queue:
    def __init__(self):
        self.l = []

    def __len__(self):
        return len(self.l)

    def enqueue(self, val):
        self.l.append(val)

    def dequeue(self):
        return self.l.pop(0)

    def first(self):
        return self.l[0]

    def is_empty(self):
        return len(self.l) == 0
