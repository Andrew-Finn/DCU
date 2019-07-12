import sys
from string import punctuation


def main():
    d = {}
    for line in sys.stdin:
        for word in line.lower().strip().split():
            word = word.strip(punctuation)
            if not word:
                continue
            if word not in d:
                d[word] = 1
            else:
                d[word] += 1

    newd = {}
    for (key, val) in sorted(d.items()):
        if len(key) > 3 and int(val) >= 3:
            newd[key] = val
    width = len(max(newd.keys(), key=len))

    for (key, val) in sorted(newd.items()):
        print('{:>{:d}} : {:>2d}'.format(key, int(width), val))


if __name__ == '__main__':
    main()
