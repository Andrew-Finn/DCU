import sys


def sorter(t):
    return t[1]


def main():
    invalid = []
    results = {}
    for line in sys.stdin:
        line = line.split(":")
        name = line[0].strip()
        count = 0
        valid = True
        for number in line[1].strip().split(","):
            try:
                count += int(number)
            except ValueError:
                invalid.append(name)
                valid = False
                continue
        if valid:
            results[name] = count

    for (k, v) in sorted(results.items(), key=sorter, reverse=True):
        print('{} : {}'.format(k, v))

    print("Skipped:")
    for line in invalid:
        print(line.strip())


if __name__ == '__main__':
    main()
