import sys


def main():
    list = []
    for line in sys.stdin:
        word = line.lower().strip()
        if "qu" in word:
            word = word.replace("qu", "")
        if "q" in word:
            list.append(line.strip())
    print("Words with q but no u:", list)


if __name__ == '__main__':
    main()
