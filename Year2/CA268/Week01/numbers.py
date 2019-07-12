def sum_to_k(lst, k):
    for n in range(len(lst)):
        for l in lst[n:]:
            if lst[n] + l == k:
                print(lst[n], l)
