import sys

vowels = 'aeiou'
vowel_freq = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0}


def vowel_frequencies(s):
    for vowel in vowels:
        vowel_freq[vowel] += s.count(vowel)


def return1(t):
    return t[1]


def main():
    for line in sys.stdin:
        line = line.strip().casefold()
        vowel_frequencies(line)
    for key, val in sorted(vowel_freq.items(), key=return1, reverse=True):
        print('{:s} : {:>{}d}'.format(key, val, len(str(max(vowel_freq.values())))))


if __name__ == '__main__':
    main()
