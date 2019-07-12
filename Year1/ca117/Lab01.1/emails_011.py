import sys


def emailname(email):
    email = email.split("@")
    fullname = email[0].split(".")
    firstname = fullname[0].capitalize()
    lastname = ''.join([i for i in fullname[1] if not i.isdigit()]).capitalize()
    return firstname + " " + lastname


def main():
    for email in sys.stdin:
        name = emailname(email)
        print(name)


if __name__ == '__main__':
    main()
