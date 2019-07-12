#!/usr/bin/env python

n = input()
i = 0
output = 0

while i < n:
    s = raw_input()
    if s == "one":
        n1 = 1
    elif s == "two":
        n1 = 2
    elif s == "three":
        n1 = 3
    elif s == "four":
        n1 = 4
    elif s == "five":
        n1 = 5
    output = n1 + output
    i = i + 1

print
output
