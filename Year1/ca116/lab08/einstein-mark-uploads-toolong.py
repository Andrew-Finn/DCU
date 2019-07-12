#!/usr/bin/env python

s = raw_input()
user = "user"
prevuser = user
count = 0
run_no = 0
end = "false"

if s == "end":
    end = "true"

while s != "end":
    i = 17
    while s[i] != "/":
        i = i + 1

    user = s[17:i]

    if user != prevuser and run_no != 0:
        print
        prevuser, count
        count = 0


    elif user != prevuser and s[len(s) - 7:] == "correct" and s[len(s) - 9:] != "incorrect":
        count = 1

    elif user == prevuser and s[len(s) - 7:] == "correct" and s[len(s) - 9:] != "incorrect":
        count = count + 1

    prevuser = user
    run_no = run_no + 1
    s = raw_input()

if end == "false":
    print
    prevuser, count
