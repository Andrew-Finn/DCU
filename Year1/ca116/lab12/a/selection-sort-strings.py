#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    a.append(s)
    s = raw_input()

i = 0
while i < len(a):
    p = i
    j = i + 1
    while j < len(a):
        if a[j] < a[p]:
            p = j
        j = j + 1

    tmp = a[p]
    a[p] = a[i]
    a[i] = tmp

    i = i + 1

i = 0
while i < len(a):
    print
    a[i]
    i = i + 1
