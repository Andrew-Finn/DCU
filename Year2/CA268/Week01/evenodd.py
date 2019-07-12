import sys

s = sys.argv[1]

if len(s) % 2 == 0:
    print(s[len(s) // 2:])
else:
    print(s[0] + s[-1])
