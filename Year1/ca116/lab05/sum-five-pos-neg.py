#!/usr/bin/env python

i = 0
postotal = 0
negtotal = 0
y = 0

while i < 5:
    y = input()
    if y < 0:
        negtotal = negtotal + y
    else:
        postotal = postotal + y
    i = i + 1

print
negtotal, postotal
