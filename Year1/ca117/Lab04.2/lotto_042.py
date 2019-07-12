import random
import sys


def random_list():
    ran_nums = []
    while len(ran_nums) < 6:
        ran_int = random.randint(1, 47)
        if ran_int not in ran_nums:
            ran_nums.append(ran_int)
    return ran_nums


def main():
    user_nums = [int(sys.argv[1]), int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4]), int(sys.argv[5]),
                 int(sys.argv[6])]
    freq_count = {0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0}
    for i in range(1000000):
        ran_nums = random_list()
        ncount = 0
        for n in user_nums:
            if n in ran_nums:
                ncount += 1
        freq_count[ncount] += 1

    freq_count[0] = 0  # Remove 0 and 1 to sort to find max length
    freq_count[1] = 0
    max_len = len(str(max(freq_count.keys())))
    print('{:>{}s} : {:{}d}'.format("Match 3's", 9, freq_count[3], max_len))
    print('{:>{}s} : {:{}d}'.format("Match 4's", 9, freq_count[4], max_len))
    print('{:>{}s} : {:{}d}'.format("Match 5's", 9, freq_count[5], max_len))
    print('{:>{}s} : {:{}d}'.format("Match 6's", 9, freq_count[6], max_len))


if __name__ == '__main__':
    main()
