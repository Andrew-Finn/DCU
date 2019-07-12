#!/usr/bin/env python

a = []

line = raw_input()
while line != "end":
    a.append(int(line))
    line = raw_input()

assert 0 < len(a)

i = 1
while i < len(a):
    p = i
    v = a[i]
    while 0 < p and v < a[p - 1]:
        a[p] = a[p - 1]
        p -= 1
    a[p] = v
    i += 1

v = None
n = 0

i = 0
while i < len(a):
    j = i + 1
    while j < len(a) and a[j] == a[i]:
        j += 1

    assert 0 < j - i

    if n < j - i:
        v = a[i]
        n = j - i

    i = j

print
v, n
