#!/usr/bin/env python

n = input()
x = 0
i = 0
while i < n:
    i = i + 1
    x = x + 1
    if x % 3 == 0 and x % 5 == 0:
        print
        "fizz-buzz"
    elif x % 3 == 0:
        print
        "fizz"
    elif x % 5 == 0:
        print
        "buzz"
    else:
        print
        x
