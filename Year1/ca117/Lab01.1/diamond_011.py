import sys


def diamond(n):
    i = 1
    while i < n:
        print((" " * (n - i) + "* " * i).rstrip())
        i += 1

    while i > 0:
        print((" " * (n - i) + "* " * i).rstrip())
        i -= 1


def main():
    halfrows = int(sys.argv[1])
    diamond(halfrows)


if __name__ == "__main__":
    main()
