import sys


def main():
    file = sys.argv[1]
    failed = False
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
                failed = True
                print("Invalid mark", line[0], "encountered. Exiting.")
        if failed is False:
            print("Best student:", beststudent)
            print("Best mark:", highest)


if __name__ == '__main__':
    main()
