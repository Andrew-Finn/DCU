#!/usr/bin/env python

import sys

total = 0
args = sys.argv[1:]

i = 0
while i < len(args):
    total = total + int(args[i])
    i = i + 1

print
total
