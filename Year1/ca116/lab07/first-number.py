#!/usr/bin/env python

s = raw_input()

i = 0
while i < len(s) and (s[i] < "0" or "9" < s[i]):
    i = i + 1

if i < len(s):
    j = i
    while j < len(s) and "0" <= s[j] and s[j] <= "9":
        j = j + 1

    print
    s[i:j], i
