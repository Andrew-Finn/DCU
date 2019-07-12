def l2d(file):
    keys = file.readline().split()
    values = file.readline().split()
    dic = {}
    for i in range(len(keys)):
        dic[keys[i]] = values[i]
    return dic
