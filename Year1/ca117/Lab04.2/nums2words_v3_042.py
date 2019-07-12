import sys


def main():
    dic = {}
    word_dic = {"zero": "0", "one": "1", "two": "2", 'three': "3", 'four': "4", "five": "5", "six": "6", "seven": "7",
                "eight": "8", "nine": "9", "ten": "10"}
    with open(sys.argv[1], "right") as file:
        for line in file:
            line = line.strip().split()
            dic[word_dic[line[0]]] = line[1]

    for line in sys.stdin:
        output = ""
        for number in line.strip().split():
            output += " " + dic[number]
        print(output.lstrip())


if __name__ == '__main__':
    main()
