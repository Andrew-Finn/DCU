import sys

for l in sys.stdin:
    evil = "evil"
    line = l.lower().strip()
    for letter in line:
        if len(evil) != 0:
            if letter in evil[0]:
                line = line.replace(letter, "*", 1)
                evil = evil.replace(letter, "", 1)
    to_print = False
    for letter in line:
        if letter in "evil":
            to_print = True
    if not to_print and len(evil) == 0:
        print(l.strip())
