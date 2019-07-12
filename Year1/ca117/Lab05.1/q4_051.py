import sys


def istime(times):
    for t in times:
        t = t.split(":")
        if not (len(t) == 2 and t[0].isdigit() and t[1].isdigit()):
            return False
    return True


def t_to_s(times):
    times = [list(map(int, t.split(":"))) for t in times]
    return [t[0] * 60 + t[1] for t in times]


def s_to_m(t):
    return "{}:{:0>2}".format(t // 60, t % 60)


def main():
    lines = [l.strip().split() for l in sys.stdin]
    best_times = [(l[0], min(t_to_s(l[1:])))
                  for l in lines if istime(l[1:])]
    best_runner = min(best_times, key=lambda l: l[1])
    print(best_runner[0], ":", s_to_m(best_runner[1]))


if __name__ == '__main__':
    main()
