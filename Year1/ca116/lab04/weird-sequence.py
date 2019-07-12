#!/usr/bin/env python

n = input()
x = 0
i = 0
print
x
while i < n - 1:
    i = i + 1
    if x > 0:
        x = -(x + 1)
    elif x < 0:
        x = -(x - 1)
    elif x == 0:
        x = x + 1
    print - x
