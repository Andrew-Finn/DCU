#!/usr/bin/env python

import sys

s = raw_input()

i = 0
commas = 0
while commas < int(sys.argv[1]) and i < len(s):
    while s[i] != ",":
        i = i + 1
    i = i + 1
    commas = commas + 1

k = 0
commas = 0
while k < len(s):
    if s[k] == ",":
        commas = commas + 1
    k = k + 1

if commas == int(sys.argv[1]):
    print
    s[i:]

else:
    j = i
    while s[j] != ",":
        j = j + 1

    print
    s[i:j]
