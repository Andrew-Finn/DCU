import sys

from parentheses_092 import matcher


def main():
    for line in sys.stdin:
        print(matcher(line.strip()))


if __name__ == '__main__':
    main()
