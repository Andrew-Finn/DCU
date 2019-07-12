import sys


def chop(s):
    s = s[1:-2]
    return s


def main():
    for line in sys.stdin:
        s = chop(line).strip()
    if len(s) > 0:
        print(s)


if __name__ == '__main__':
    main()
