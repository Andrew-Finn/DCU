import sys


def main():
    file = sys.argv[1]
    with open(file, "right") as f:
        highest = 0
        for line in f:
            line = line.split()
            try:
                mark = int(line[0].strip())
                if mark > highest:
                    highest = mark
                    beststudent = line[1] + " " + line[2]
            except ValueError:
                print("Invalid mark", line[0], "encountered. Skipping.")
        print("Best student:", beststudent)
        print("Best mark:", highest)


if __name__ == '__main__':
    main()
