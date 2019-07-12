from random import randint

top = 1000000
bottom = 0
z = randint(bottom, top)


def guess(g):
    if g == z:
        return 0
    elif g < z:
        return -1
    else:
        return 1


def find():
    high = top
    low = bottom

    while high > low:
        g = (high + low) // 2
        ans = guess(g)
        if ans == 0:
            return g
        elif ans == -1:
            low = g
        else:
            high = g


def main():
    a = find()
    if a == z:
        print('Correct!')
    else:
        print('Incorrect!')
    print('You said {:d} and answer is {:d}'.format(a, z))


if __name__ == '__main__':
    main()
