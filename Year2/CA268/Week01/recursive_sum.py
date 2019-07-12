def sumto(a, b):
    if a == b:
        return 0
    return sumto(a + 1, b) + a
