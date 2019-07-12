def make_adjacency_matrix(edge_list):
    import string
    d, i = {}, 0
    for l in string.ascii_uppercase:
        d[l] = i
        i += 1
    adjacency_matrix = [[0] * len(edge_list) for i in range(len(edge_list))]
    for i in range(len(edge_list)):
        curr_edge, curr_matrix = edge_list[i], adjacency_matrix[i]
        for letter in curr_edge:
            curr_matrix[d[letter]] = 1
    return adjacency_matrix
