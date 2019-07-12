#!/usr/bin/env python

i = 0
total = 0
y = 0

while i < 5:
    y = input()
    if y < 0:
        y = y * -1
    total = total + y
    i = i + 1

print
total
