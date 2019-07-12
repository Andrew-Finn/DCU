#!/usr/bin/env python

line_one = raw_input()
s = raw_input()
city = ""
statecode = ""
wi = 0

i = 0
while s != "end":
    i = 0
    while s[i] != ",":
        i = i + 1
    city = s[:i]
    statecode = s[i + 1:i + 3]
    if statecode == "WI":
        wi = wi + 1
    s = raw_input()

print
wi
