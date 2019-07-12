#!/usr/bin/env python

i1 = 0

while i1 < 10:
    i = 0
    s1 = ""
    s2 = ""
    s = raw_input()

    while s[i] != "+":
        s1 = s1 + s[i]
        i = i + 1

    i = i + 1
    i1 = i1 + 1
    s2 = s[i:]
    output = int(s1) + int(s2)
    print
    output
