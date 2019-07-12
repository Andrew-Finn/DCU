#!/usr/bin/env python

if __name__ == "__main__":
    a = [1, 23, 343, 54, 53, 10]

lowest = 9 ** 999
i = 0
while i < len(a):
    if a[i] < lowest:
        lowest = i
    i = i + 1

print
lowest
