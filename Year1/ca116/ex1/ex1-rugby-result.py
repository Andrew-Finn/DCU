#!/usr/bin/env python

htry = input()
hcon = input()
hpen = input()
atry = input()
acon = input()
apen = input()

homescore = (5 * htry) + (2 * hcon) + (3 * hpen)
awayscore = (5 * atry) + (2 * acon) + (3 * apen)

if homescore == awayscore:
    print
    "draw"
elif homescore > awayscore:
    print
    "home win"
elif homescore < awayscore:
    print
    "away win"
