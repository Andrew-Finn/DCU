from triathlete_v1_111 import Triathlete


def main():
    t1 = Triathlete('Ian Brown', 21)
    t2 = Triathlete('John Squire', 22)

    assert (t1.name == 'Ian Brown')
    assert (t1.tid == 21)

    print(t1)
    print(t2)


if __name__ == '__main__':
    main()
