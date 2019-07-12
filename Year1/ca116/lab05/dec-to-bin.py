#!/usr/bin/env python

n = input()
s = ""

while 0 < n:
    if n % 2 == 0:
        s = "0" + s
    else:
        s = "1" + s
    n = n / 2

print
s
