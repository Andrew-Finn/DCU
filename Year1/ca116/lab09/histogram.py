#!/usr/bin/env python

zero = 0
one = 0
two = 0
three = 0
four = 0
five = 0
six = 0
seven = 0
eight = 0
nine = 0

s = raw_input()
while s != "end":
    s = int(s)

    if s == 0:
        zero = zero + 1

    elif s == 1:
        one = one + 1

    elif s == 2:
        two = two + 1

    elif s == 3:
        three = three + 1

    elif s == 4:
        four = four + 1

    elif s == 5:
        five = five + 1

    elif s == 6:
        six = six + 1

    elif s == 7:
        seven = seven + 1

    elif s == 8:
        eight = eight + 1

    elif s == 9:
        nine = nine + 1

    s = raw_input()

print
"0", zero * "*"
print
"1", one * "*"
print
"2", two * "*"
print
"3", three * "*"
print
"4", four * "*"
print
"5", five * "*"
print
"6", six * "*"
print
"7", seven * "*"
print
"8", eight * "*"
print
"9", nine * "*"
