import sys


def main():
    for l in sys.stdin:
        line = l.strip().lower()
        vowels = "aeiou"
        for letter in line:
            if len(vowels) != 0:
                if letter in vowels[0]:
                    line = line.replace(letter, "", 1)
                    vowels = vowels.replace(letter, "", 1)
        to_print = True
        for letter in line:
            if letter in "aeiou":
                to_print = False
        if to_print and len(vowels) == 0:
            print(l.strip())


if __name__ == '__main__':
    main()
