#!/usr/bin/env python

s = raw_input()
i = 0
a = []

while s != "end":
    a.append(s)
    s = raw_input()

while i < len(a):
    print
    i, len(a), a[i]
    i = i + 1
