import sys


def main():
    clublist = []
    lines = []

    for line in sys.stdin:
        clublist.append(" ".join(line.split()[1:-8]).strip())
        lines.append(line)

    longest = 0
    for team in clublist:
        if len(team) > longest:
            longest = len(team)

    print(
        '{:>3s} {:{}s} {:>2s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s}'.format('POS', 'CLUB', longest, 'P', 'W',
                                                                                       'D', 'L', 'GF', 'GA', 'GD',
                                                                                       'PTS'))

    for line in lines:
        a = line.split()
        pos = a[0]
        club = " ".join(a[1:-8]).strip()
        p = a[-8]
        won = a[-7]
        draw = a[-6]
        lost = a[-5]
        gf = a[-4]
        ga = a[-3]
        gd = a[-2]
        points = a[-1]

        print('{:>3s} {:{}s} {:>2s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s} {:>3s}'.format(pos, club, longest, p, won,
                                                                                             draw, lost, gf, ga, gd,
                                                                                             points))


if __name__ == '__main__':
    main()
