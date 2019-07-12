def minimum(l):
    if len(l) == 1:
        return l[0]
    else:
        return minimum(l[1:] if l[0] > l[-1] else l[:-1])
