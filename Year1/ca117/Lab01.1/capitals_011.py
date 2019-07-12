import sys


def main():
    for line in sys.stdin:
        s = line.strip()
        if len(s) > 1:
            first = s[0]
            first = first.capitalize()
            last = s[-1]
            last = last.capitalize()
            print(first + s[1:-1] + last)


if __name__ == '__main__':
    main()
