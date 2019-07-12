import sys
from string import punctuation


def removep(s):
    s = s.lower()
    for p in punctuation:
        if p == "'":
            continue
        else:
            s = s.replace(p, "")
    return s


def main():
    words = sys.stdin.read().strip().split()
    words = [removep(w) for w in words]
    word_count = dict()
    for word in words:
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1

    for w, freq in sorted(word_count.items()):
        print(w, ":", freq)


if __name__ == '__main__':
    main()
