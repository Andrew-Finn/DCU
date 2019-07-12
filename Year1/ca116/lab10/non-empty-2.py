#!/usr/bin/env python

if __name__ == "__main__":
    a = ["", "", ""]

i = 0
total = 0
while i < len(a) and a[i] == "":
    i = i + 1

if i < len(a):
    print
    a[i]
