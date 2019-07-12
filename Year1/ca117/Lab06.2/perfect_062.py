import sys


def sumFac(line):
    a = sum([i for i in range(1, (line // 2) + 1) if line % i == 0])
    return a


def isPerfect(line, a):
    return line == a


def main():
    for line in sys.stdin:
        line = int(line.strip())
        print(isPerfect(line, sumFac(line)))


if __name__ == '__main__':
    main()
