import string
import sys


def contnumber(password):
    for i in password:
        if i in string.digits:
            return 1
    return 0


def contupper(password):
    for i in password:
        if i in string.ascii_uppercase:
            return 1
    return 0


def contlower(password):
    for i in password:
        if i in string.ascii_lowercase:
            return 1
    return 0


def contsymbol(password):
    for i in password:
        if i in string.punctuation:
            return 1
    return 0


def main():
    for password in sys.stdin:
        l = contsymbol(password) + contlower(password) + contnumber(password) + contupper(password)
        print(l)


if __name__ == '__main__':
    main()
