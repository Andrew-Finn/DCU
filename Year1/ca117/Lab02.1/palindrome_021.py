import sys


def reverse(s):
    return s[::-1]


def main():
    for line in sys.stdin:
        punctuation = '!"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~ '
        for letter in line:
            if letter in punctuation:
                line = line.replace(letter, "")
        rev = reverse(line).strip().lower()
        line = line.strip().lower()
        print(line == rev)


if __name__ == '__main__':
    main()
