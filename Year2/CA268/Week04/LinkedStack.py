from LinkedList import LinkedList


class LinkedStack:
    def __init__(self):
        self.ll = LinkedList()

    def push(self, e):
        self.ll.add(e)
        return self

    def pop(self):
        return remove()

    def is_empty(self):
        return self.ll.is_empty()
