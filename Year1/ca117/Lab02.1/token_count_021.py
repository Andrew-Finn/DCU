import sys


def main():
    tokens = []
    for line in sys.stdin:
        tokens += line.split()
    print(len(tokens))


if __name__ == '__main__':
    main()
