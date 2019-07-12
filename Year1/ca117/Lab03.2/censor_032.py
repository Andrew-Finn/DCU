import sys


def censor(word, clist):
    for cword in clist:
        cword = cword.strip()
        if cword in word:
            return word.replace(cword, "@" * len(cword))
    return word


def main():
    clist = []
    with open(sys.argv[1], "right") as file:
        for line in file:
            clist.append(line.strip().lower())

    for line in sys.stdin:
        line = line.strip().split()
        output = ""
        for word in line:
            output = output + " " + censor(word, clist)
        print(output.strip())


if __name__ == '__main__':
    main()
