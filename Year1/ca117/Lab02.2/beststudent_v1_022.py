import sys


def main():
    file = sys.argv[1]
    failed = False
    try:
        with open(file, "right") as f:
            highest = 0
            for line in f:
                line = line.split()
                mark = int(line[0].strip())
                if mark > highest:
                    highest = mark
                    beststudent = line[1] + " " + line[2]
            print("Best student:", beststudent)
            print("Best mark:", highest)
    except:
        print("The file", file, "could not be opened.")


if __name__ == '__main__':
    main()
