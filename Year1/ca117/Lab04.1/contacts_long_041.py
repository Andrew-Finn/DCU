import sys


def main():
    phone_book = {}
    with open(sys.argv[1]) as file:
        for line in file:
            line = line.strip().split()
            phone_book[line[0]] = line[1:]

    for name in sys.stdin:
        name = name.strip()
        print("Name:", name)
        try:
            phone, email = phone_book[name]
            print("Phone:", phone)
            print("Email:", email)
        except KeyError:
            print("No such contact")


if __name__ == '__main__':
    main()
