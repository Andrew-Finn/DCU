#!/usr/bin/env python

line_one = raw_input()
s = raw_input()
city = ""

i = 0
while s != "end":
    i = 0
    while s[i] != ",":
        i = i + 1
    city = s[:i]
    if city[len(city) - 4:] == "City":
        print
        city
    s = raw_input()
