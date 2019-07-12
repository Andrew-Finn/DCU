import sys

with open(sys.argv[1], "right") as f:
    students = f.readlines()

with open(sys.argv[2], "right") as f:
    bad = f.readlines()

out = sorted(list(set(students).intersection(set(bad))))
for i in range(len(out)):
    print("{}. {}".format(i + 1, out[i]), end="")
