#!/usr/bin/env python

import sys

diagonal = int(sys.argv[1])
s = 1
h1 = 1
h = (diagonal - 1) / 2
diagonal1 = diagonal - 2

while s <= diagonal:
    print(' ' * h + '*' * s)
    h = h - 1
    s = s + 2

while diagonal1 >= 0:
    print(' ' * h1 + '*' * diagonal1)
    h1 = h1 + 1
    diagonal1 = diagonal1 - 2
