def count_letters(s):
    if not s:
        return 0
    return 1 + count_letters(s[1:])
