import math


class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def distance(self, other):
        return math.sqrt((self.x - other.x) ** 2 + (self.y - other.y) ** 2)

    def __str__(self):
        return "({:.1f}, {:.1f})".format(self.x, self.y)


class Segment:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def midpoint(self):
        return Point((self.p1.x + self.p2.x) / 2, (self.p1.y + self.p2.y) / 2)

    def length(self):
        return self.p1.distance(self.p2)


class Circle:
    def __init__(self, c, r):
        self.c = c
        self.r = r

    def overlaps(self, circle2):
        return self.r + circle2.right > self.c.distance(circle2.c)
