class Node:
    def __init__(self, key, data, left=None, right=None, parent=None):
        self.key = key
        self.data = data
        self.left_child = left
        self.right_child = right
        self.parent = parent

    def is_left_child(self):
        return self.parent and self.parent.left_child == self

    def is_right_child(self):
        return self.parent and self.parent.right_child == self

    def has_left_child(self):
        return self.left_child

    def has_right_child(self):
        return self.right_child

    def is_root(self):
        return not self.parent

    def is_leaf(self):
        return not (self.right_child or self.left_child)

    def has_children(self):
        return self.right_child or self.left_child

    def had_both_children(self):
        return self.right_child and self.left_child

    def splice_out(self):
        if self.is_leaf():
            if self.is_left_child():
                self.parent.left_child = None
            else:
                self.parent.right_child = None
        elif self.has_children():
            if self.has_left_child():
                if self.is_left_child():
                    self.parent.left_child = self.left_child
                else:
                    self.parent.right_child = self.left_child
                self.left_child.parent = self.parent
            else:
                if self.is_left_child():
                    self.parent.left_child = self.right_child
                else:
                    self.parent.right_child = self.right_child
                self.right_child.parent = self.parent

    def find_successor(self):
        if self.has_right_child():
            return self.right_child.find_min()
        else:
            if self.parent:
                if self.is_left_child():
                    return self.parent
                else:
                    self.parent.right_child = None
                    successor = self.parent.find_successor()
                    self.parent.right_child = self
                    return successor

    def find_min(self):
        current = self
        while current.has_left_child():
            current = current.left_child
        return current

    def replace_data(self, key, data, left_child, right_child):
        self.key = key
        self.data = data
        self.left_child = left_child
        self.right_child = right_child
        if self.has_left_child():
            self.left_child.parent = self
        if self.has_right_child():
            self.right_child.parent = self


def remove(current_node):
    if current_node.is_leaf():
        if current_node == current_node.parent.left_child:
            current_node.parent.left_child = None
        else:
            current_node.parent.right_child = None
    elif current_node.had_both_children():
        successor = current_node.find_successor()
        successor.splice_out()
        current_node.key = successor.key
        current_node.data = successor.data

    else:
        if current_node.has_left_child():
            if current_node.is_right_child():
                current_node.left_child.parent = current_node.parent
                current_node.parent.right_child = current_node.left_child
            elif current_node.is_left_child():
                current_node.left_child.parent = current_node.parent
                current_node.parent.left_child = current_node.left_child
            else:
                current_node.replace_data(current_node.left_child.key, current_node.left_child.data,
                                          current_node.left_child.left_child, current_node.left_child.right_child)
        else:
            if current_node.is_left_child():
                current_node.right_child.parent = current_node.parent
                current_node.parent.left_child = current_node.right_child
            elif current_node.is_right_child():
                current_node.right_child.parent = current_node.parent
                current_node.parent.right_child = current_node.right_child
            else:
                current_node.replace_data(current_node.right_child.key, current_node.right_child.data,
                                          current_node.right_child.left_child, current_node.right_child.right_child)


class Tree:
    def __init__(self):
        self.root = None
        self.size = 0

    def insert(self, key, value):
        if self.root:
            self.rec_insert(key, value, self.root)
        else:
            self.root = Node(key, value)
        self.size += 1

    def rec_insert(self, key, value, current_node):
        if key < current_node.key:
            if current_node.has_left_child():
                self.rec_insert(key, value, current_node.left_child)
            else:
                current_node.left_child = Node(key, value, parent=current_node)
        else:
            if current_node.has_right_child():
                self.rec_insert(key, value, current_node.right_child)
            else:
                current_node.right_child = Node(key, value, parent=current_node)

    def find(self, key):
        if self.root:
            data = self.rec_find(key, self.root)
            if data:
                return data.data
            return "Contact not found!"
        return "Contact not found!"

    def rec_find(self, key, current_node):
        if not current_node:
            return None
        elif current_node.key == key:
            return current_node
        elif key < current_node.key:
            return self.rec_find(key, current_node.left_child)
        return self.rec_find(key, current_node.right_child)

    def __contains__(self, key):
        if self.rec_find(key, self.root):
            return True
        return False

    def delete(self, key):
        if self.size != 0:
            to_remove = self.rec_find(key, self.root)
            if to_remove:
                remove(to_remove)
                self.size = self.size - 1
            else:
                raise KeyError("Contact not found!")
        elif self.size == 1 and self.root.key == key:
            self.root = None
            self.size = self.size - 1
        else:
            raise KeyError("Contact not found!")


class Contact:
    def __init__(self, name, address, phone):
        self.phone = phone
        self.address = address
        self.name = name

    def __str__(self):
        return "Name: {}  Phone: {}  Address: {}".format(self.name, self.phone, self.address)


def get_hash(string):
    return (hash(string) ** 2) / 2


class PhoneBook:
    def __init__(self):
        self.numberTree = Tree()
        self.nameTree = Tree()

    def add(self, contact):
        self.numberTree.insert(get_hash(contact.phone), contact)
        self.nameTree.insert(get_hash(contact.name), contact)

    def search_name(self, name):
        return self.nameTree.find(get_hash(name))

    def search_number(self, number):
        return self.numberTree.find(get_hash(number))

    def remove_name(self, name, remove_both=True):
        name = get_hash(name)
        if name in self.nameTree:
            if remove_both:
                self.remove_number(self.nameTree.find(name).phone, remove_both=False)
            self.nameTree.delete(name)
            return True
        return "Name not found"

    def remove_number(self, number, remove_both=True):
        number = get_hash(number)
        if number in self.numberTree:
            if remove_both:
                self.remove_name(self.numberTree.find(number).name, remove_both=False)
            self.numberTree.delete(number)
            return True
        return "Number not found"


def test_phonebook():
    import random

    print("Running tests")
    # Create trees and phone book
    book = PhoneBook()

    # Add contacts
    book.add(Contact("Person1", "Address1", "Number1"))
    book.add(Contact("Person2", "Address2", "Number2"))
    book.add(Contact("Person3", "Address3", "Number3"))
    book.add(Contact("Person4", "Address4", "Number4"))
    book.add(Contact("Person5", "Address5", "Number5"))
    book.add(Contact("Person6", "Address6", "Number6"))

    # Check basic functions
    assert book.search_number("Number0") == "Contact not found!"
    assert str(book.search_name("Person1")) == "Name: Person1  Phone: Number1  Address: Address1"
    assert str(book.search_number("Number1")) == "Name: Person1  Phone: Number1  Address: Address1"

    # Check removing via name works
    assert str(book.search_name("Person2")) == "Name: Person2  Phone: Number2  Address: Address2"
    book.remove_name("Person2")
    assert str(book.search_name("Person2")) == "Contact not found!"
    assert str(book.search_number("Number2")) == "Contact not found!"

    # Check removing via number works
    assert str(book.search_name("Person3")) == "Name: Person3  Phone: Number3  Address: Address3"
    book.remove_number("Number3")
    assert str(book.search_name("Person3")) == "Contact not found!"
    assert str(book.search_number("Number3")) == "Contact not found!"

    #  Check function still find remaining names after deletions
    assert str(book.search_name("Person1")) == "Name: Person1  Phone: Number1  Address: Address1"
    assert str(book.search_number("Number1")) == "Name: Person1  Phone: Number1  Address: Address1"
    assert str(book.search_name("Person4")) == "Name: Person4  Phone: Number4  Address: Address4"
    assert str(book.search_number("Number4")) == "Name: Person4  Phone: Number4  Address: Address4"
    assert str(book.search_name("Person5")) == "Name: Person5  Phone: Number5  Address: Address5"
    assert str(book.search_number("Number5")) == "Name: Person5  Phone: Number5  Address: Address5"
    assert str(book.search_name("Person6")) == "Name: Person6  Phone: Number6  Address: Address6"
    assert str(book.search_number("Number6")) == "Name: Person6  Phone: Number6  Address: Address6"

    # Add more contacts and search for them
    book.add(Contact("Person7", "Address7", "Number7"))
    book.add(Contact("Person8", "Address8", "Number8"))
    assert str(book.search_name("Person7")) == "Name: Person7  Phone: Number7  Address: Address7"
    assert str(book.search_number("Number7")) == "Name: Person7  Phone: Number7  Address: Address7"
    assert str(book.search_name("Person8")) == "Name: Person8  Phone: Number8  Address: Address8"
    assert str(book.search_number("Number8")) == "Name: Person8  Phone: Number8  Address: Address8"

    # Ok it work -_- But... is it fast?
    # Adding 9990 more contacts, then randomly searching for 1000 entries
    # A.K.A. 10,000 contacts find 1,000
    for i in range(10, 10000):
        book.add(Contact("Person{}".format(i), "Address{}".format(i), "Number{}".format(i)))
    for _ in range(1000):
        i = random.randint(11, 9999)
        assert str(book.search_number("Number{}".format(i))) == \
               "Name: Person{}  Phone: Number{}  Address: Address{}".format(i, i, i)
    print("All test ran.. Success!")


if __name__ == '__main__':
    test_phonebook()
