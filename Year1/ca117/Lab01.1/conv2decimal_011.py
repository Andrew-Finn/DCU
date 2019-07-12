import sys


def convert(line):
    line = line.split()
    number = line[0]
    base = int(line[1])
    total = 0
    for power in range(len(number)):
        total += ((int(number[-1 - power])) * (base ** power))
    return total


def main():
    for line in sys.stdin:
        l = convert(line)
        print(l)


if __name__ == '__main__':
    main()
