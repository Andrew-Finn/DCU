#!/usr/bin/env python

year = input()
s = ((year % 4) == 0 and (year % 100) != 0) or (year % 400 == 0)
print
s
