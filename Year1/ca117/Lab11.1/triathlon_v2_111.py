class Triathlete:
    def __init__(self, name, tid):
        self.name = name
        self.tid = tid

    def __str__(self):
        return "Name: {}\nID: {}".format(self.name, self.tid)


class Triathlon:
    def __init__(self):
        self.athletes = []

    def __str__(self):
        return "\n".join(str(a) for a in sorted(self.athletes, key=lambda x: x.name))

    def add(self, athlete):
        self.athletes.append(athlete)

    def remove(self, tid):
        ind = next(a for a in self.athletes if a.tid == tid)
        self.athletes.remove(ind)

    def lookup(self, tid):
        return next((a for a in self.athletes if a.tid == tid), None)
