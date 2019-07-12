import string


def make_adjacency_matrix(edge_list):
    adjacency_matrix = []
    alphabet = string.ascii_uppercase[:len(edge_list)]
    nodes = len(edge_list)
    for lst in edge_list:
        l = []
        for letter in alphabet:
            if letter in lst:
                l.append(1)
            else:
                l.append(0)
        adjacency_matrix.append(l)

    return adjacency_matrix


print(make_adjacency_matrix([
    ['B', 'C'],
    ['A'],
    ['A'],
]))
