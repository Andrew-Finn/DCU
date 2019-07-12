#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    a.append(int(s))
    s = raw_input()

s = raw_input()
a.append(int(s))

i = 1
while i < len(a):
    v = a[i]
    p = i
    while 0 < p and v < a[p - 1]:
        a[p] = a[p - 1]
        p = p - 1

    a[p] = v
    i = i + 1

print
a
