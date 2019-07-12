#
#   Use this class definition to work from.
#   This way of reading the dictionary is quete messy.
#   It is done this way to make testing easier.
#
from string import ascii_lowercase

from Node import Node
from read_dictionary import read_dictionary

valid_words = None


class WordGameNode(Node):
    def __init__(self, name, parent=None):
        # Ensure lowercase letters (no digits or special chars)
        for letter in name:
            assert letter in ascii_lowercase

        global valid_words
        if valid_words == None or len(valid_words) != len(name):
            # We only need to examine words which have the same length as our word (self.name)
            valid_words = read_dictionary("/etc/dictionaries-common/words", len(name))
        self.name = name
        self.parent = parent

    def __str__(self):
        return self.name

    def get_children(self):
        l = []
        newWord = self.name
        for i in range(len(self.name)):
            for x in ascii_lowercase:
                if i < len(self.name) - 1 and i == 0:
                    newWord = x + self.name[i + 1:]
                elif i < len(self.name) - 1 and i > 0:
                    newWord = self.name[:i] + x + self.name[i + 1:]
                else:
                    newWord = self.name[:i] + x
                if newWord != self.name and newWord in valid_words:
                    l.append(WordGameNode(newWord))
        return l

    def get_path(self):
        # insert code here
        return path
