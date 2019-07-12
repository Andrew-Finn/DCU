#!/usr/bin/env python

n = input()
m = input()
i = 0
print
m
while i < n - 1:
    i = i + 1
    if m % 2 == 0:
        m = m / 2
    elif m % 2 != 0:
        m = (3 * m) + 1
    print
    m
