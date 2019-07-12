#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    a.append(s)
    s = raw_input()

i = 0
while i < len(a):
    print
    a[len(a) - i - 1]
    i = i + 1
