#!/usr/bin/env python

a = input()
b = input()

while b != 0:
    temp = b
    b = a % b
    a = temp

print
a
