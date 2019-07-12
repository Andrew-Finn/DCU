#!/usr/bin/env python

import sys

s = raw_input()
argument = sys.argv[1]

i = 0
count = 0
while i < len(s):
    count = count + 1
    j = i
    while s[i] != "," and i < len(s):
        i = i + 1
    word = s[j:i]
    if word == argument:
        print
        count
        i = len(s)
