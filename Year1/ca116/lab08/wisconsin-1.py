#!/usr/bin/env python

line_one = raw_input()
s = raw_input()
city = ""
statecode = ""

i = 0
while s != "end":
    i = 0
    while s[i] != ",":
        i = i + 1
    city = s[:i]
    statecode = s[i + 1:i + 3]
    if statecode == "WI":
        print
        city
    s = raw_input()
