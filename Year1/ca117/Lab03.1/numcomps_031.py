import sys


def main():
    n = int(sys.argv[1])
    n = 12
    mul3 = []
    mul3_sqrd = []
    mul4 = []
    mul4_doub = []
    mul3and4 = []
    mul3_x = []
    prime_list = []

    for i in range(1, n + 1):
        if i % 3 == 0:
            mul3.append(i)
            mul3_sqrd.append(i ** 2)
            mul3_x.append("X")
        else:
            mul3_x.append(i)
        if i % 4 == 0:
            mul4.append(i)
            mul4_doub.append(i * 2)
        if i % 4 == 0 and i % 3 == 0:
            mul3and4.append(i)
        if is_prime(i):
            prime_list.append(i)

    print("Multiples of 3:", mul3)
    print("Multiples of 3 squared:", mul3_sqrd)
    print("Multiples of 4 doubled:", mul4_doub)
    print("Multiples of 3 or 4:", list(set(mul3 + mul4)))
    print("Multiples of 3 and 4:", mul3and4)
    print("Multiples of 3 replaced:", mul3_x)
    print("Primes:", prime_list)


if __name__ == '__main__':
    main()
