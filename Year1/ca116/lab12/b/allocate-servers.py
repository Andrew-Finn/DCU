#!/usr/bin/env python

a = []
line = raw_input()
while line != "end":
    a.append(int(line))
    line = raw_input()

max_load = 0
i = 0
while i < len(a):
    load = 0
    j = i
    while j < len(a) and a[j] < a[i] + 1000:
        load += 1
        j += 1

    if load > max_load:
        max_load = load

    i += 1

print
max_load
