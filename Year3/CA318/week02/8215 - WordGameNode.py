from string import ascii_lowercase

from Node import Node


class WordGameNode(Node):
    def __init__(self, name, parent=None):
        # Ensure lowercase letters (no digits or special chars)
        for letter in name:
            assert letter in ascii_lowercase
        self.name = name
        self.parent = parent

    def __str__(self):
        return self.name

    def get_children(self):
        # all one letter mutations of the word
        child_words =  # Your code here
        return  # Need to return a list of WordGameNode objects.

    def get_path(self):
        # insert code here
        return path
