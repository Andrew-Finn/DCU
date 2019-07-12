import sys


def removepunc(line):
    punctuation = '!"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~'
    for letter in line:
        if letter in punctuation:
            line = line.replace(letter, "")
    return line


def main():
    foundwords = []
    unique = 0
    for line in sys.stdin:
        line = removepunc(line)
        wordlist = line.lower().split()
        for word in wordlist:
            if word not in foundwords:
                foundwords.append(word)
                unique += 1
    print(unique)


if __name__ == '__main__':
    main()
