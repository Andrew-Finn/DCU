#!/usr/bin/env python

s = raw_input()
i = 0
t = ""

while i < len(s):
    if s[i] != " ":
        t = t + s[i]

    i = i + 1

print
t
