from collections import deque  # Used as a priority queue, because were allowed and its easier than doing it myself :)

import pandas  # For fancy table formatting... where was this for CA116 :(


class Edge:
    """Basic class which stores basic information about an Edge

    Parameters:
        start (str/int): start position of the new edge
        end (str/int): end position of the new edge
        cost (int): the numeric cost to go from start -> end
   """

    def __init__(self, start, end, cost):
        self.cost = cost
        self.end = end
        self.start = start


class Graph:
    """
    A class that stores all the edge and vertices needed to create a graph.
   """

    def __init__(self):
        self.edges = list()
        self.vertices = set()
        self.update_vertices()
        self.neighbours = dict()
        self.update_neighbours()

    def update_vertices(self):
        self.vertices = set(sum(([edge.start, edge.end] for edge in self.edges), list()))

    def update_neighbours(self):
        neighbours = {vertex: set() for vertex in self.vertices}
        for edge in self.edges:
            neighbours[edge.start].add((edge.end, edge.cost))
        self.neighbours = neighbours

    def remove_vertex(self, vert):
        """A method of a graph that will remove  given vertex
        Parameters:
            vert (str/int): the vertex to be removed
       """
        edges = self.edges.copy()
        self.vertices.remove(vert)
        for edge in edges:
            if edge.start == vert or edge.end == vert:
                self.edges.remove(edge)
        self.update_vertices(), self.update_neighbours()

    def add_edge(self, start, end, cost):
        """A method of a graph that will add a new edge bidirectionally
        Parameters:
            start (str/int): start position of the edge
            end (str/int): end position of the edge
            cost (int): the numeric cost to go from start -> end
       """
        if start in self.edges or end in self.edges:
            raise KeyError("Can not add an edge that already exists, Remove edge first")
        self.edges.append(Edge(start, end, cost))
        self.edges.append(Edge(end, start, cost))

        self.update_vertices(), self.update_neighbours()

    def draw_graph(self):
        """A method that will draw the current state of the graph in a new window
       """
        import matplotlib.pyplot as plt  # Importing here to show only used to visualise
        import networkx as nx
        network_graph = nx.Graph()
        for edge in self.edges:
            network_graph.add_edge(edge.start, edge.end, weight=edge.cost)
            network_graph.add_edge(edge.end, edge.start, weight=edge.cost)

        edge_labels = dict([((u, v,), d['weight']) for u, v, d in network_graph.edges(data=True)])
        pos = nx.spring_layout(network_graph)
        nx.draw_networkx_edge_labels(network_graph, pos, edge_labels=edge_labels)
        nx.draw(network_graph, pos, node_size=400, with_labels=True)
        plt.show()

    def dijkstra(self, source, destination):
        """A Dijkstra's algorithm that will calculate the shortest path from source -> destination

        Parameters:
            source (str/int): source/start vertex
            destination (str/int): end/finish vertex

        Returns: ([list], cost) (Tuple): returns a tuple, who's first index is a list of the edges taken to reach the
        destination and who's second index in the cost of that path.
        """
        if destination not in self.vertices:
            raise KeyError("Cannot search to a destination that does not exist. {} is not in graph".format(destination))
        distances = {vertex: float('INF') for vertex in self.vertices}
        previous_vertices = {vertex: None for vertex in self.vertices}
        distances[source] = 0
        to_visit = self.vertices.copy()

        while to_visit:
            current_vertex = min(to_visit, key=lambda v: distances[v])
            to_visit.remove(current_vertex)
            if distances[current_vertex] == float('INF'):
                break
            for neighbour, cost in self.neighbours[current_vertex]:
                alternative_route = distances[current_vertex] + cost
                if alternative_route < distances[neighbour]:
                    distances[neighbour] = alternative_route
                    previous_vertices[neighbour] = current_vertex

        path, current_vertex = deque(), destination
        while previous_vertices[current_vertex] is not None:
            path.appendleft(current_vertex)
            current_vertex = previous_vertices[current_vertex]
        if path:
            path.appendleft(current_vertex)
        return list(path), distances[destination]


class Router:
    """A class that will initialise a router node

    Parameters:
    _router (str/int): The node that will act as a router
    _graph (Graph): The graph on which the router is to be implemented

   """

    def __init__(self, _router, _graph):
        self.graph = _graph
        self.router = _router

    def get_path(self, dest):
        """A method that will print various status including shortest path from the router to the given node
        Parameters:
            dest (str/int): the destination node value
       """
        p_list, cost = self.graph.dijkstra(self.router, dest)
        print("Start: {}\nEnd:{}\nPath: {}\nCost: {}".format(self.router, dest, "->".join(p_list), cost))

    def print_routing_table(self):
        """A method that will print the path and value(if any) from the router to every vertex in a table form
       """
        dic = {'from': [], 'to': [], "cost": [], "path": []}
        for vertex in graph.vertices:
            if vertex != self.router:
                path, cost = self.graph.dijkstra(self.router, vertex)
                if cost == float('INF'):
                    cost = 0
                dic["to"].append(vertex)
                dic["from"].append(self.router)
                dic["cost"].append(cost)
                dic["path"].append("->".join(path))
        print(pandas.DataFrame(data=dic))

    def remove_router(self, vert):
        """A method that remove a given vertex from all instances of that graph
        Parameters:
            vert (str/int): the vertex to be removed
       """
        self.graph.remove_vertex(vert)


if __name__ == '__main__':
    print("_____________________________________")
    print("Initialising graph... ", end="")
    graph = Graph()
    graph.add_edge("a", "b", 7)
    graph.add_edge("a", "c", 9)
    graph.add_edge("a", "f", 14)
    graph.add_edge("b", "c", 10)
    graph.add_edge("b", "d", 15)
    graph.add_edge("c", "d", 11)
    graph.add_edge("c", "f", 2)
    graph.add_edge("d", "e", 6)
    graph.add_edge("e", "f", 9)
    router = Router("a", graph)
    print("Done!")
    print("_____________________________________")
    print("router.get_path("f")")
    router.get_path("f")
    print("_____________________________________")
    print("router.print_routing_table()")
    router.print_routing_table()
    print("_____________________________________")
    print("router.remove_router('c')")
    print("router.print_routing_table()")
    router.remove_router("c")
    router.print_routing_table()
    print("_____________________________________")
    print("Initialising new graph... ", end="")
    del graph, router
    graph = Graph()
    graph.add_edge("a", "b", 7)
    graph.add_edge("a", "c", 9)
    graph.add_edge("a", "f", 14)
    graph.add_edge("b", "c", 10)
    graph.add_edge("b", "d", 15)
    graph.add_edge("c", "d", 11)
    graph.add_edge("c", "f", 2)
    graph.add_edge("d", "e", 6)
    graph.add_edge("e", "f", 9)
    print("Done!")
    print('router = Router("a", graph)\nrouter_two = Router("b", graph)')
    router = Router("a", graph)
    router_two = Router("b", graph)
    print("_____________________________________")
    print("router.print_routing_table()")
    router.print_routing_table()
    print("_____________________________________")
    print("router_two.print_routing_table()")
    router_two.print_routing_table()
    print("_____________________________________")
    print("Show graph with C: Close tab to continue")
    graph.draw_graph()
    print("router.remove_router('c')")
    router.remove_router('c')
    print("Show graph without C: Close tab to continue")
    graph.draw_graph()
    print("_____________________________________")
    print("router.print_routing_table()")
    router.print_routing_table()
    print("_____________________________________")
    print("router_two.print_routing_table()")
    router_two.print_routing_table()
    print("_____________________________________")
