import sys


def make_map():
    d = {}
    for line in sys.stdin:
        student = line.split()
        if len(student) == 2:
            d[student[0]] = student[1]
    return d
