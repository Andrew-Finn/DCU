#!/usr/bin/env python

mark = input()
first = 70 <= mark
second = 50 <= mark and mark <= 69
third = 40 <= mark and mark <= 49
fail = mark <= 39

print
"first:", first
print
"second:", second
print
"third:", third
print
"fail:", fail
