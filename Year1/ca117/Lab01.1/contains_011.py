import sys


def contains(line):
    line = line.split()
    letters = line[0].lower()
    word = line[1].lower()
    for letter in letters:
        if letter in word:
            word = word.replace(letter, " ", 1)
        else:
            return False
    return True


def main():
    for line in sys.stdin:
        result = contains(line.strip())
        print(result)


if __name__ == '__main__':
    main()
