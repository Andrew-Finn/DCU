#!/usr/bin/env python

s = raw_input()
while s != "end":
    i = 0
    while s[i] != ":":
        i = i + 1

    print
    s[:i]
    s = raw_input()
