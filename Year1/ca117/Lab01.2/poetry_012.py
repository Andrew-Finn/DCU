import sys


def main():
    longest = 0
    lines = []
    for line in sys.stdin:
        if len(line) - 1 > longest:
            longest = len(line) - 1
        lines.append(line.strip())

    for s in lines:
        print("{:^{}s}".format(s, longest))


if __name__ == '__main__':
    main()
