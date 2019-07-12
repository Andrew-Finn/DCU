#!/usr/bin/env python

s = raw_input()

i = 0
while s[i] != ".":
    i = i + 1

print
s[:i]
print
s[i + 1:]
