#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    a.append(int(s))
    s = raw_input()

n = input()

p = len(a)
while 0 < p and n < a[p - 1]:
    p = p - 1
print
p
