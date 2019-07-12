import sys

count = [0] * 10  # Must be outside def main() as used in def poker()


def poker(n):
    count[n] += 1


def main():
    readlines = sys.stdin.readlines()
    length = len(readlines)
    for line in readlines:
        line = line.rstrip()
        poker(int(line[-1]))  # Only concerned with last digit(s)

    print("The probability of nothing is {:.4f}%".format(count[0] / length * 100))  # Times 100 to move 2 decimals right
    print("The probability of one pair is {:.4f}%".format(count[1] / length * 100))
    print("The probability of two pairs is {:.4f}%".format(count[2] / length * 100))
    print("The probability of three of a kind is {:.4f}%".format(count[3] / length * 100))
    print("The probability of a straight is {:.4f}%".format(count[4] / length * 100))
    print("The probability of a flush is {:.4f}%".format(count[5] / length * 100))
    print("The probability of a full house is {:.4f}%".format(count[6] / length * 100))
    print("The probability of four of a kind is {:.4f}%".format(count[7] / length * 100))
    print("The probability of a straight flush is {:.4f}%".format(count[8] / length * 100))
    print("The probability of a royal flush is {:.4f}%".format(count[9] / length * 100))


if __name__ == "__main__":
    main()

#  The probability of nothing is 50.1209%
#  The probability of one pair is 42.2498%
#  The probability of two pairs is 4.7622%
#  The probability of three of a kind is 2.1121%
#  The probability of straight is 0.3885%
#  The probability of flush is 0.1996%
#  The probability of full house is 0.1424%
#  The probability of four of a kind is 0.0230%
#  The probability of straight flush is 0.0012%
#  The probability of royal flush is 0.0003%
#
#  Sample data: https://ca117.computing.dcu.ie/resources/pokerhands.txt (<25mb / 100,000 lines)
