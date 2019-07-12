import sys


def vowels(word):
    fword = word.lower()
    v = ["a", "e", "i", "o", "u"]
    for letter in fword:
        if letter in v:
            v.remove(letter)
    if len(v) == 0:
        return True
    else:
        return False


def list_shortest(list):
    shortest = list[0]
    for word in list:
        if len(word) < len(shortest):
            shortest = word
    return shortest


def containsletter(word, find, list, amount, Greater):
    count = 0
    for letter in word.lower():
        if letter == find:
            count += 1
    if Greater:
        if count == amount:
            list.append(word)
    else:
        if count >= amount:
            list.append(word)
    return list


def contains(word, find, list):
    if find in word.lower():
        list.append(word)
    return list


def contains_anagram(word, list, anagram):
    if len(word) == len(anagram):
        if sorted(word.lower()) == sorted(anagram.lower()) and word != anagram:
            list.append(word)
    else:
        return list
    return list


def main():
    length17 = []
    length18plus = []
    cont_all_vowels = []
    four_a = []
    two_plus_q = []
    cie = []
    anagram = []
    iary = []
    e_list = []
    highest_e = 0

    for word in sys.stdin:
        word = word.strip()
        if len(word) == 17:  # Greater than 17 characters
            length17.append(word)
        if len(word) >= 18:
            length18plus.append(word)
        if vowels(word):  # Contains all vowels
            cont_all_vowels.append(word)
        if len(word) >= 4:  # End in iary
            if word[-4:] == "iary":
                iary.append(word)

        count = 0  # E Count
        for letter in word.lower():
            if letter == "E" or letter == "e":
                count += 1
        if count != 0:
            if count > highest_e:
                highest_e = count
                e_list = []
                e_list.append(word)
            elif count == highest_e:
                e_list.append(word)

        four_a = containsletter(word, "a", four_a, 4, False)  # Exactly 4 a's
        two_plus_q = containsletter(word, "q", two_plus_q, 2, True)  # More than 2 q's
        cie = contains(word, "cie", cie)  # Contains 4 cie
        anagram = contains_anagram(word, anagram, "angle")  # Anagram

    print("Words containing 17 letters:", length17)
    print("Words containing 18+ letters:", length18plus)
    print("Shortest word containing all vowels:", list_shortest(cont_all_vowels))
    print("Words with 4 a's:", four_a)
    print("Words with 2+ q's:", two_plus_q)
    print("Words containing cie:", cie)
    print("Anagrams of angle:", anagram)
    print("Words ending in iary:", len(iary))
    print("Words with most e's:", e_list)


if __name__ == '__main__':
    main()

# By far this is the most inefficient and unclean program i have ever written (Not saying a lot)
