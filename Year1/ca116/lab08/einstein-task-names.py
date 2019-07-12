#!/usr/bin/env python

s = raw_input()
while s != "end":
    duplicate = "false"
    i = len(s) - 1
    while s[i] != "/":
        i = i - 1
    name = s[i + 1:]
    if name[len(name) - 7:] == "correct":
        duplicate = "true"

    elif name[len(name) - 9:] == "incorrect":
        duplicate = "true"

    if duplicate == "false":
        print
        name

    s = raw_input()
