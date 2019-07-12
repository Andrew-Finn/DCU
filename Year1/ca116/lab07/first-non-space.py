#!/usr/bin/env python

s = raw_input()

i = 0
while i < len(s) and not s[i] != " ":
    i = i + 1

if i < len(s):
    print
    i
else:
    print
    "-1"
