#!/usr/bin/env python

i = 0
curr = input()
prev = 0

while i < 5:
    prev = curr
    curr = input()
    if curr == prev:
        print
        "equal"
    elif curr > prev:
        print
        "higher"
    elif prev > curr:
        print
        "lower"
    i = i + 1
