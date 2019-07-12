def rprint(a, b):
    if a < b:
        print(a)
        rprint(a + 1, b)
