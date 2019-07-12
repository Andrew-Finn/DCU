def swap_keys_values(dic):
    return dict(zip(dic.values(), dic.keys()))


def main():
    dic = {'a': 4, 'b': 7, 'c': 10}
    print(dic)
    print()
    print(swap_keys_values(dic))


if __name__ == '__main__':
    main()
