#!/usr/bin/env python

total = 0
even = []
odd = []

s = raw_input()
while s != "end":
    s = int(s)
    if s % 2 == 0:
        even.append(s)

    elif s % 2 != 0:
        odd.append(s)

    s = raw_input()

i = 0
while i < len(even):
    print
    even[i]
    i = i + 1

i = 0
while i < len(odd):
    print
    odd[i]
    i = i + 1
