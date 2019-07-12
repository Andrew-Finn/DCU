import sys


def main():
    needprint = True
    for line in sys.stdin:
        try:
            number = int(line.strip())
            if needprint is True:
                print("Thank you for", number)
            needprint = False
        except:
            number = line.strip()
            if needprint is True:
                print(number, "is not a number")


if __name__ == '__main__':
    main()
