#!/usr/bin/env python

output = 0

i = 0
while i < 6:
    n = input()
    if output == 0 or n > output:
        output = n
    i = i + 1

print
output
