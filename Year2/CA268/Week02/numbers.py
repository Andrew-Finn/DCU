def sum_to_k(lst, k):
    while True:
        if len(lst) <= 1:
            return False
        if k - lst[0] in lst[1:]:
            return True
        lst = lst[1:]
