def swap_unique_keys_values(dic):
    values = list(dic.values())
    return {val: key for key, val in dic.items() if values.count(val) == 1}
