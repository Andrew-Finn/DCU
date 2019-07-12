#!/usr/bin/env python

if __name__ == "__main__":
    a = [8, 9, 4, 7, 2, 11]
    i = 1
    j = 2

if len(a) > 1:
    i1 = a[i]
    j1 = a[j]

    a[i] = j1
    a[j] = i1
