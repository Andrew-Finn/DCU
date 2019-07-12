#!/usr/bin/env python

s = raw_input()

i = 0
while i < len(s) and not ("A" <= s[i] and s[i] <= "Z"):
    i = i + 1

if i < len(s):
    print
    s[i], i
