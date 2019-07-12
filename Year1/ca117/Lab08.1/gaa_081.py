class Score:
    def __init__(self, goals=0, points=0):
        self.points = int(points)
        self.goals = int(goals)

    def __str__(self):
        return "{} goal(s) and {} point(s)".format(self.goals, self.points)

    def __eq__(self, other):
        return self.as_points() == other.as_points()

    def __ge__(self, other):
        return self.as_points() >= other.as_points()

    def __lt__(self, other):
        return self.as_points() < other.as_points()

    def __add__(self, other):
        return Score(points=self.points + other.points, goals=self.goals + other.goals)

    def __sub__(self, other):
        return Score(points=self.points - other.points, goals=self.goals - other.goals)

    def __iadd__(self, other):
        self.points += other.points
        self.goals += other.goals
        return self

    def __isub__(self, other):
        self.points -= other.points
        self.goals -= other.goals
        return self

    def as_points(self):
        return self.goals * 3 + self.points
