#!/usr/bin/env python

s1 = raw_input()
s2 = raw_input()
s3 = raw_input()
ls1 = len(s1)
ls2 = len(s2)
ls3 = len(s3)

if ls1 > ls2 and ls1 > ls3:
    print
    s1
elif ls2 > ls1 and ls2 > ls3:
    print
    s2
else:
    print
    s3
