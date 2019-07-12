import math
import sys


def roots(a, b, c):
    try:
        r1 = (-b + (math.sqrt(b ** 2 - 4 * a * c))) / (2 * a)
        r2 = (-b - (math.sqrt(b ** 2 - 4 * a * c))) / (2 * a)
        return r1, r2

    except ValueError:
        return None


def main():
    for line in sys.stdin:
        line = line.strip().split()
        [a, b, c] = line
        if roots(int(a), int(b), int(c)) is not None:
            [r1, r2] = roots(int(a), int(b), int(c))
            print('r1 = {}, r2 = {}'.format(r1, r2))
        else:
            print('None')


if __name__ == '__main__':
    main()
