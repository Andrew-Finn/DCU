def maximum(lst):
    if len(lst) == 1:
        return lst[0]
    if lst[0] < lst[1]:
        return maximum(lst[1:])
    else:
        return maximum(lst[:1] + lst[2:])
