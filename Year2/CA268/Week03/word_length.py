def get_counts_dict(l):
    dic = {}
    for i in l:
        if len(i) not in dic.keys():
            dic[len(i)] = 1
        else:
            dic[len(i)] += 1
    return dic
