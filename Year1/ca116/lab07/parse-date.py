#!/usr/bin/env python

s = raw_input()
month = "month"
date = "date"
year = "year"
day = "day"

i = 0
while s[i] != " ":
    i = i + 1

day = s[:i]
n = i
i = i + 1
while s[i] != " ":
    i = i + 1

date = s[n + 1: i]

n = i
while s[i] != ",":
    i = i + 1

month = s[n + 1: i]
year = s[i + 2:]

print
month, date + ",", year, "(" + day + ")"
