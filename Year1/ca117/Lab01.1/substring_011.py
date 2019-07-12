import sys


def main():
    for line in sys.stdin:
        l = line.split()
        sub = l[0]
        sub = sub.lower()
        string = l[1]
        string = string.lower()
        found = "False"
        i = 0
        while i < len(string) and len(sub) < len(string) and found == "False":
            if string[i:i + len(sub)] == sub:
                print("True")
                found = "True"
            i += 1
        if found == "False":
            print("False")


if __name__ == '__main__':
    main()
