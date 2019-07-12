import sys

for l in sys.stdin:
    line = l.strip()
    for letter in l:
        if letter not in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
            line = line.replace(letter, "*")
    line = "".join(line).split("*")
    print(max(line, key=len))
