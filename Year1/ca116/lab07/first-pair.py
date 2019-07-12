#!/usr/bin/env python

s = raw_input()

i = 1
while i < len(s):
    if s[i] == s[i - 1]:
        print
        s[i] + s[i - 1]
        i = len(s)
    i = i + 1
