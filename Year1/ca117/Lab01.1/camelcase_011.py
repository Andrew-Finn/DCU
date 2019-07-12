import sys


def wordcap(line):
    output = ""
    line = line.split()
    for i in range(0, len(line)):
        word = line[i]
        output += word.capitalize() + " "
    return output.rstrip()


def main():
    for line in sys.stdin:
        capped = wordcap(line)
        print(capped)


if __name__ == '__main__':
    main()
