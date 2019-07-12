def make_edge_list(adjacency):
    """ this function create an edge list representation of a graph using the supplied adjacency matrix
    """
    # Maybe start with an empty edge_list
    edge_list = []
    for lst in adjacency:
        l = []
        for i in range(len(lst)):
            if lst[i] == 1:
                l.append(chr(ord("A") + i))
        edge_list.append(l)

    return edge_list


print(make_edge_list([[0, 1, 1], [1, 0, 0], [1, 0, 0]]))
