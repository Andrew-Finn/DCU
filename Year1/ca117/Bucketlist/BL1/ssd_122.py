import sys


def ssd(n, b):
    a = []
    while n > b:
        a.append(n % b)
        n = n // b
    a.append(n)
    b = a[::-1]
    total = 0
    j = 0
    while j < len(b):
        total = total + (b[j] ** 2)
        j += 1
    return total


def main():
    i = 1
    error = []
    for line in sys.stdin:
        try:
            [n, b] = line.rstrip().split()
            n = int(n)
            b = int(b)
        except ValueError:
            error.append(i)
            continue
        else:
            print(ssd(n, b))
        finally:
            i += 1
    i = 0
    err = []
    while i < len(error):
        err.append(str(error[i]))
        i += 1
    if len(err) != 0:
        fail = ", ".join(err)
        print('Failed to convert line(s):', fail + " ")


if __name__ == '__main__':
    main()
