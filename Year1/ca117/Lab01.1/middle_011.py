import sys


def main():
    for line in sys.stdin:
        l = line.split()
        sub = l[1]
        sub = sub.lower()
        string = l[2]
        string = string.lower()
        i = 0
        while i < len(string) and len(sub) < len(string):
            if s[i:i + len(sub)] == sub:
                print("True")
            else:
                print("False")
            i += 1


if __name__ == '__main__':
    main()
