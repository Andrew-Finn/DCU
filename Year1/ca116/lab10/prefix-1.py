#!/usr/bin/env python

if __name__ == "__main__":
    a = ["mountain", "montagne", "mont", "mo", "montages", "zebra", "monthly"]
    s = "mont"

lenght = len(s)
i = 0
while i < len(a):
    word = a[i]
    if word[:lenght] == s:
        print
        a[i]
    i = i + 1
