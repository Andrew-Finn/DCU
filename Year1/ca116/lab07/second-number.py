#!/usr/bin/env python

s = raw_input()
i = 0

while i < len(s) and not (s[i] >= "0" and s[i] <= "9"):
    i = i + 1

if i < len(s):
    j = i
    while j < len(s) and (s[j] >= "0" and s[j] <= "9"):
        j = j + 1
if i < len(s):
    k = j
    while k < len(s) and not (s[k] >= "0" and s[k] <= "9"):
        k = k + 1
if i < len(s):
    l = k
    while l < len(s) and (s[l] >= "0" and s[l] <= "9"):
        l = l + 1
    print
    s[k:l], k
