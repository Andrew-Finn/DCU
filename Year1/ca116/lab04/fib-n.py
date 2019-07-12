#!/usr/bin/env python

n = input()
i = 0
t1 = 0
print
t1
t2 = 1
print
t2
output = 0
while i < n - 2:
    i = i + 1
    output = t1 + t2
    t1 = t2
    t2 = output
    print
    output
