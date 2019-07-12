#!/usr/bin/env python

s = raw_input()
a = []
b = []
loop = "true"

while s != "end":
    a.append(s)
    s = raw_input()

s = raw_input()
while s != "end":
    if s == "":
        b.append("br")
    else:
        b.append(int(s))
    s = raw_input()

if len(b) == 0:
    loop = "false"

i = 0
t = ""
space = "false"
while i < len(b) and loop == "true":
    if b[i] == "br":
        space = "true"
        print
        t[1:]
        t = ""

    else:
        t = t + " " + a[b[i]]

    i = i + 1

if space == "false" and loop == "true":
    print
    t[1:]
