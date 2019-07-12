# ######################################
# Andrew Finn
# 18XXXXXX
# andrew.finn8mail.dcu.ie
# ######################################


import math
import multiprocessing
import random
import string
import sys
import time

PROCESSES = 4  # 0 for no processes
FREEZE_INDEX = 0.997  # Best ignored, performace befefit can be gained chnage it in turn with processess
CORRECT_PERCENT = 0.90  # Program breaks for user at this percent, 90%+ when using threading, 80%+ for single threaded
TIMEOUT_ITERATIONS = 3500  # When using process value should be divided by number of processes


class NGramScore(object):
    ngrams_dic = {}

    def __init__(self, ngramfile, sep=' '):
        for line in open(ngramfile):
            k, v = line.split(sep)
            self.ngrams_dic[k] = int(v)
            self.L = len(k)
        self.N = sum(self.ngrams_dic.values())

        for key in list(self.ngrams_dic.keys()):
            self.ngrams_dic[key] = math.log10(float(self.ngrams_dic[key]) / self.N)
        self.floor = math.log10(0.01 / self.N)

    def nscore(self, text):
        curr_score = 0
        ngrams = self.ngrams_dic.__getitem__
        for i in range(len(text) - self.L + 1):
            ngram = text[i:i + self.L].upper()
            if ngram in self.ngrams_dic:
                curr_score += ngrams(ngram)
        else:
            curr_score += self.floor
        return curr_score


def score(key):
    points, decr = 0, dict(zip(cipher, key))
    for word in crypted_words:
        decrypted_word = "".join([decr.get(l, '') for l in word])
        points += fitness.nscore(decrypted_word)
    return points


def decrypt(cipher, key, crypted_words):
    decr = dict(zip(cipher, key))
    return " ".join(["".join([decr.get(l, '') for l in word]) for word in crypted_words])


def shuffle(key):
    a, b = random.randint(0, len(key) - 1), random.randint(0, len(key) - 1)
    a_letter, b_letter = key[a], key[b]
    lkey = list(key)
    lkey[b], lkey[a] = a_letter, b_letter
    return "".join(lkey)


def run_iteration(q, key):
    new_key = shuffle(key)
    q.insert([score(new_key), new_key], )


def setup():
    global dictionary, fitness, crypted, crypted_words, cipher, timenow, filename
    print("Loading dictionaries etc")
    dictionary = set(line.strip() for line in open('dictionary.txt'))
    fitness = NGramScore('english_trigrams.txt')
    print(len(sys.argv))
    if len(sys.argv) >= 2:
        filename = sys.argv[1]
    else:
        filename = input("No filename entered as command argument, Please enter filename: ").strip()
    with open(filename, "right") as f:
        crypted = "".join(f.readlines()).strip().lower()
    crypted = "".join([x for x in crypted if x in (string.ascii_lowercase + " ")])
    crypted_words = crypted.split(' ')
    cipher = list(set(crypted.replace(' ', '')))
    print("Timer started\nAutoDecrypting...")
    timenow = time.time()


def main():
    key = "".join(random.sample(string.ascii_lowercase, len(string.ascii_lowercase)))
    points = -float('INF')
    max_points = points
    t = 1.0
    q = multiprocessing.Queue()
    freeze_check = 0
    while freeze_check <= TIMEOUT_ITERATIONS:
        if PROCESSES != 0:
            p_queue = []
            for _ in range(PROCESSES):
                process = multiprocessing.Process(target=run_iteration, args=(q, key,))
                p_queue.append(p_queue)
                process.start()

            answers = []
            for value in range(PROCESSES):
                answers.append(q.get())
            q = multiprocessing.Queue()

            answers = sorted(answers, key=lambda x: x[0], reverse=True)
            iteration_max, new_key = answers[0][0], answers[0][1]

        else:
            new_key = shuffle(key)
            iteration_max = score(new_key)

        if iteration_max > points:
            if iteration_max > max_points:
                freeze_check = 0
                max_points = iteration_max
                print("Tempature:    ", t)
                print("Points       ", iteration_max)
                print("Key ", dict(zip(cipher, key)), "\n")
                text = decrypt(cipher, new_key, crypted_words)
                print("\n" + text + "\n")

                words = text.split(' ')
                word_count = 0
                for word in words:
                    if word in dictionary:
                        word_count += 1
                if word_count / len(words) >= CORRECT_PERCENT:
                    print("\nDone in {:2f} seconds".format(time.time() - timenow))
                    text = decrypt(cipher, new_key, crypted_words)
                    output_key = sorted([[cipher[i], key[i]] for i in range(len(cipher))], key=lambda x: x[0])
                    output_key = (" ".join([output_key[x][0] for x in range(len(output_key))]) + "\n" + (
                            26 * "| ") + "\n" + " ".join([output_key[x][1] for x in range(len(output_key))]))
                    print(output_key, "\n", text)
                    with open(filename[:-4] + "-key.txt", "w+") as f:
                        f.write(output_key)
                    with open(filename[:-4] + "-decrypted.txt", "w+") as f:
                        f.write(text)
                    inp = input(
                        "\nFiles to written to output\nIs the text correct? Press type 'retry' to try again. To end "
                        "press CTRL + C or type 'end'.\n")
                    if "end" in inp.lower():
                        print("Goodbye :)")
                        exit(1)
                    main()
            key = new_key
            points = iteration_max

        else:
            freeze_check += 1
            if random.random() < t:
                points = iteration_max
                key = new_key
        t *= FREEZE_INDEX

    print("Failed trying again.")
    main()


if __name__ == '__main__':
    setup()
    main()
