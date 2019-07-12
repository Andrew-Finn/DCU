#!/usr/bin/env python

s = raw_input()
j = 0
i = 0
output = 0

while i < len(s):
    j = i
    while j < len(s) and s[j] != "+":
        j = j + 1
    output = output + int(s[i:j])
    i = j + 1
print
output
