import math
import sys


def main():
    print('{:.{}f}'.format(math.pi, int(sys.argv[1])))


if __name__ == '__main__':
    main()
