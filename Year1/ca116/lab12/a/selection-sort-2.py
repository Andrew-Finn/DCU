#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    a.append(int(s))
    s = raw_input()

i = input()
p = i
j = i + 1
while j < len(a):
    if a[j] < a[p]:
        p = j
    j = j + 1

print
p
