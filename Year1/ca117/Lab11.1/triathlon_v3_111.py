class Triathlete:
    def __init__(self, name, tid):
        self.name = name
        self.tid = tid
        self.times = {}

    def __str__(self):
        return "Name: {}\nID: {}\nRace time: {}".format(
            self.name, self.tid, self.race_time())

    def add_time(self, sport, time):
        self.times[sport] = time

    def get_time(self, sport):
        return self.times[sport]

    def race_time(self):
        return sum(self.times.values())

    def __lt__(self, other):
        return self.race_time() < other.race_time()

    def __eq__(self, other):
        return self.race_time() == other.race_time()


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

    def best(self):
        return min(self.athletes, key=lambda a: a.race_time())

    def worst(self):
        return max(self.athletes, key=lambda a: a.race_time())
