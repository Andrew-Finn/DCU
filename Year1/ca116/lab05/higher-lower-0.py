#!/usr/bin/env python

curr = input()
prev = 0

while curr != 0:
    prev = curr
    curr = input()
    if curr == 0:
        quit()
    elif curr == prev:
        print
        "equal"
    elif curr > prev:
        print
        "higher"
    elif prev > curr:
        print
        "lower"
