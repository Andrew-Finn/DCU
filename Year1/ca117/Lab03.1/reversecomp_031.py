import sys


def bin_search(l, s):
    low = 0
    high = len(l)
    while high > low + 1:
        mid = (low + high) // 2
        if l[mid] > s:
            high = mid
        elif l[mid] < s:
            low = mid
        else:
            return l[mid] == s


def main():
    lines = [l.strip() for l in sys.stdin]
    lines_lower = [l.lower() for l in lines]
    print([line for line in lines if len(line) >= 5 and bin_search(lines_lower, line.lower()[::-1])])


if __name__ == '__main__':
    main()
