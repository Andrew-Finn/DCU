#!/usr/bin/env python

s = raw_input()
correct = 0
while s != "end":
    if s[len(s) - 7:] == "correct" and s[len(s) - 9:] != "incorrect":
        correct = correct + 1
    s = raw_input()

print
correct
