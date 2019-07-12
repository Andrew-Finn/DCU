class Score(object):
    def __init__(self, goals=0, points=0):
        self.goals = goals
        self.points = points
        self.score = (goals * 3) + points

    def greater_than(self, other):
        return self.score > other.score

    def less_than(self, other):
        return self.score < other.score

    def equal_to(self, other):
        return self.score == other.score
