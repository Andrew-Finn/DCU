import sys
from math import pi


def radius_table(r, inc, end_radius):
    print('{:>s} {:>15s} {:>15s}'.format('Radius (m)', 'Area (m^2)', 'Volume (m^3)'))
    print('{:>s} {:>15s} {:>15s}'.format('-' * len('Radius (m)'), '-' * len('Area (m^2)'), '-' * len('Volume (m^3)')))

    while r <= end_radius:
        print('{:>10.1f}{:>16.2f}{:>16.2f}'.format(r, 4 * (pi * (r ** 2)), (4 / 3) * (pi * (r ** 3))))
        r += inc


def main():
    radius_table(float(sys.argv[1]), float(sys.argv[2]), float(sys.argv[3]))


if __name__ == '__main__':
    main()
