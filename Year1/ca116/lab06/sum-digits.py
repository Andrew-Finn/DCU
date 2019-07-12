#!/usr/bin/env python

s = raw_input()
i = 0
total = 0

while i < len(s):
    total = int(s[i]) + total
    i = i + 1

print
total
