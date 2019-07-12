import sys


def sorter(t):
    return t[1]


def main():
    food_dic = {}
    name_cal = {}
    with open(sys.argv[1], "right") as f:
        for line in f:
            line = line.strip().split()
            food_dic[" ".join(line[:-1])] = int(line[-1])

    for line in sys.stdin:
        words = line.strip().split(",")
        name = words[0]
        foodstuffs = words[1:]
        calories = 0
        for food in foodstuffs:
            try:
                calories += food_dic[food]
            except KeyError:
                calories += 100
            name_cal[name] = calories

    for (k, v) in sorted(name_cal.items(), key=sorter):
        max_v_width = len(str(max(name_cal.values())))
        max_k_width = len(max(name_cal.keys()))
        print('{:>{}s} : {:{}d}'.format(k, max_k_width, v, max_v_width))


if __name__ == '__main__':
    main()
