#!/usr/bin/env python

s = raw_input()
a = []
total = 0

while s != "end":
    s = int(s)
    total = total + s
    a.append(s)
    s = raw_input()

if len(a) > 1:
    average = total // len(a)
    i = 0
    while i < len(a):
        if a[i] > average:
            print
            a[i]
        i = i + 1
