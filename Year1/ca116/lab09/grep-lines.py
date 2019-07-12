#!/usr/bin/env python

import sys

args = sys.argv[1]
a = []
line = ""

s = raw_input()
while s != "end":
    a.append(s)
    s = raw_input()

i = 0
j = 0
while j < len(a):
    line = a[j]
    i = 0
    while i < len(line):
        k = i + len(args)
        if line[i:k] == args:
            print
            a[j]
        i = i + 1

    j = j + 1
