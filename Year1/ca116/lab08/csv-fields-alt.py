#!/usr/bin/env python

# City,State,LatD,LatM,LatS,NS,LonD,LonM,LonS,EW

s = raw_input()

while s != "end":
    commas = 0
    i = 0

    while i < len(s):
        if s[i] == ",":
            commas = commas + 1
        i = i + 1

    i = 0
    j = 0
    k = 0
    while k < commas:
        while s[i] != ",":
            i = i + 1
        print
        s[j:i]
        i = i + 1
        j = i
        k = k + 1
    print
    s[i:]
