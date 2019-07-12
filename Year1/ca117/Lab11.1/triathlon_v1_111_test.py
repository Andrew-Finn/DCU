from triathlon_v1_111 import Triathlete, Triathlon


def main():
    tn = Triathlon()
    t1 = Triathlete('Ian Brown', 21)
    t2 = Triathlete('John Squire', 22)

    tn.add(t1)
    tn.add(t2)

    t = tn.lookup(21)
    assert (isinstance(t, Triathlete))
    assert (t.name == 'Ian Brown')
    assert (t.tid == 21)

    remove(21)
    t = tn.lookup(21)
    assert (t is None)


if __name__ == '__main__':
    main()
