#!/usr/bin/env python

n = input()
n1 = n % 10

if n == 11 or n == 12 or n == 13:
    print
    "th"
elif n1 == 1:
    print
    "st"
elif n1 == 2:
    print
    "nd"
elif n1 == 3:
    print
    "rd"
else:
    print
    "th"
