#!/usr/bin/env python

s = raw_input()
a = []
b = []

while s != "end":
    a.append(s)
    s = raw_input()

s = raw_input()
while s != "end":
    b.append(s)
    s = raw_input()

i = 0
j = 0
s = a[0]
while i < len(b):
    j = 0
    while j < len(a):
        s = a[j]
        if b[i] == s[:8]:
            print
            s[9:]
        j = j + 1
    i = i + 1
