import sys


def main():
    file = sys.argv[1]
    failed = False
    try:
        with open(file, "right") as f:
            highest = 0
            for line in f:
                line = line.split()
                name = " ".join(line[1:])
                mark = int(line[0].strip())
                if mark == highest:
                    beststudent += ", " + name
                elif mark > highest:
                    highest = mark
                    beststudent = name
    except:
        print("The file", file, "could not be opened.")

    if failed is False:
        print("Best student(s):", beststudent)
        print("Best mark:", highest)


if __name__ == '__main__':
    main()
