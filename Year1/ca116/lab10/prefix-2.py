#!/usr/bin/env python

if __name__ == "__main__":
    a = []
    s = "mont"

lenght = len(s)
i = 0
while i < len(a):
    word = a[i]
    if word[:lenght] == s:
        print
        a[i]
        i = len(a) + 1
    i = i + 1

if i < len(s):
    i = 1
