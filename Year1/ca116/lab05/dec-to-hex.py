#!/usr/bin/env python

n = input()
hexref = "0123456789abcdef"
output = ""

while n != 0:
    remainder = n % 16
    divisor = n / 16
    output = hexref[remainder] + output
    n = divisor

print
output
