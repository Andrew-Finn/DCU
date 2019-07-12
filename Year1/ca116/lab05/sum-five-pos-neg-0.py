#!/usr/bin/env python

postotal = 0
negtotal = 0
y = 1

while y != 0:
    y = input()
    if y < 0:
        negtotal = negtotal + y
    else:
        postotal = postotal + y

print
negtotal, postotal
