import sys


def main():
    for line in sys.stdin:
        word = line.strip().split()
        word1 = sorted(word[0])
        word2 = sorted(word[1])


if __name__ == '__main__':
    main()
