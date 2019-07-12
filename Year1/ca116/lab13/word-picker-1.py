#!/usr/bin/env python

s = raw_input()
a = []
b = []

while s != "end":
    a.append(s)
    s = raw_input()

s = raw_input()
while s != "end":
    n = int(s)
    print
    a[n]
    s = raw_input()
