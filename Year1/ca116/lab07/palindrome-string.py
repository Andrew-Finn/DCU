#!/usr/bin/env python

s = raw_input()
t = ""

i = 0
while i < len(s):
    t = s[i] + t
    i = i + 1

if s == t:
    print
    s
