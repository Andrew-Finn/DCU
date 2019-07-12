#!/usr/bin/env python

n = input()
t1 = 0
print
t1
t2 = 1
print
t2
output = 0
while output < n:
    output = t1 + t2
    t1 = t2
    t2 = output
    if n > output:
        print
        output
