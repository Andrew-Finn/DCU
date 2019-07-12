class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def __str__(self):
        return "({}, {})".format(self.x, self.y)

    def midpoint(self, other):
        return Point((self.x + other.x) / 2, (self.y + other.y) / 2)


class Circle:
    def __init__(self, centre=None, radius=0):
        self.centre = centre if centre else Point()
        self.radius = radius

    def __str__(self):
        return "Centre: {}\nRadius: {}".format(self.centre, self.radius)

    def __add__(self, other):
        return Circle(radius=self.radius + other.radius, centre=self.centre.midpoint(other.centre))
