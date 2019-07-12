#!/usr/bin/env python

if __name__ == "__main__":
    a = [2]

if len(a) > 1:
    i = a[0]
    last = a[len(a) - 1]

    a.pop()
    a[0] = last
    a.append(first)
