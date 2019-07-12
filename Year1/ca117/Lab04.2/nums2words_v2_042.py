import sys


def main():
    dic = {"0": "zero", "1": "one", "2": "two", '3': "three", '4': "four", "5": "five", "6": "six", "7": "seven",
           "8": "eight", "9": "nine", "10": "ten"}
    for line in sys.stdin:
        output = ""
        for number in line.strip().split():
            try:
                output += " " + dic[number]
            except KeyError:
                output += " unknown"
        print(output.lstrip())


if __name__ == '__main__':
    main()
