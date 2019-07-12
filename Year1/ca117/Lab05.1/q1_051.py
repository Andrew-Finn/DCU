import sys

s = sys.argv[1]
t = tuple(s)

i = 0
a = []
b = []
while i < len(t):
    x = t[i: i + 2][::-1]
    a.append("".join(x))
    i += 2

print("".join(a))
