from math import sqrt


class Point(object):
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self, other):
        return sqrt((other.y - self.y) ** 2 + (other.x - self.x) ** 2)


class Shape(object):
    def __init__(self, points):
        self.points = points

    def sides(self):
        len_sides = []
        for i in range(1, len(self.points)):
            len_sides.append(self.points[i - 1].distance(self.points[i]))
        len_sides.append(self.points[-1].distance(self.points[0]))
        return len_sides

    def perimeter(self):
        return sum(self.sides())


class Triangle(Shape):
    def area(self):
        a, b, c = self.sides()
        s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))


class Square(Shape):
    def area(self):
        return self.sides()[0] ** 2
