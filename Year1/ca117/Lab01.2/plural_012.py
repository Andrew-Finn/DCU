import sys


def plural(word):
    es_words = ['ch', 'sh', 'x', 's', 'z']
    vowels = ['a', 'e', 'i', 'o', 'u']

    if word[-2:] in es_words or word[-1:] in es_words:
        return word + "es"

    elif word[-1] == 'y' and not word[-2] in vowels:
        return word[:-1] + "ies"

    elif word[-2:] == "fe":
        return word[:-2] + "ves"

    elif word[-1] == "f":
        return word[:-1] + "ves"

    elif word[-1] == "o":
        return word + "es"

    else:
        return word + "s"


def main():
    for word in sys.stdin:
        l = plural(word.strip())
        print(l)


if __name__ == '__main__':
    main()
