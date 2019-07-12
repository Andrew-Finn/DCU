#!/usr/bin/env python

lines = []
n = raw_input()

while n != 'end':
    if n not in lines:
        lines.append(n)
    n = raw_input()

i = 0
while i < len(lines):
    print
    lines[i]
    i = i + 1
