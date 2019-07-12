#!/usr/bin/env python

s = raw_input()
a = []

while s != "end":
    t = s[6:8] + "|" + s[3:5] + "|" + s[:2] + "|" + s[8:]
    a.append(t)
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
j = 0
while i < len(a):
    s = a[i]
    while s[j] != " ":
        j = j + 1
    print
    s[j + 1:]
    i = i + 1
