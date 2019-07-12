import sys

string = sys.argv[1]
n = int(sys.argv[2])
if n > len(string):
    while n > len(string):
        n -= len(string)
    output = string[:-n]
    output = (string[-n:]) + output
    print(output)
elif n != 0:
    output = string[:-n]
    output = (string[-n:]) + output
    print(output)
else:
    print(string)
