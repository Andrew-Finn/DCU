def get_counts(lst):
    l = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    for word in lst:
        l[len(word)] = l[len(word)] + 1
    return l
