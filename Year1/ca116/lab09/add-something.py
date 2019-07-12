#!/usr/bin/env python

s = raw_input()
a = []

i = 0
while s != "end":
    a.append(int(s))
    s = raw_input()
    i = i + 1

m = raw_input()
j = 0
while j < i:
    print
    a[j] + int(m)
    j = j + 1
