#!/usr/bin/env python

s = raw_input()
while s != "end":
    i = 0
    while s[i] != ":":
        i = i + 1

    login = s[:i]
    i = len(s) - 1
    while s[i] != ":":
        i = i - 1

    shell = s[i + 1:]
    print
    login, shell

    s = raw_input()
