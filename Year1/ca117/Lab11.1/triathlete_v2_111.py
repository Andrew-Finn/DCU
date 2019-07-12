class Triathlete(object):
    def __init__(self, name, tid, stime=0, ctime=0, rtime=0, totalt=0):
        self.name = name
        self.tid = tid
        self.stime = stime
        self.ctime = ctime
        self.rtime = rtime
        self.totalt = totalt

    def __str__(self):
        return "Name: {}\nID: {}\nRace time: {}".format(self.name, self.tid, self.totalt)

    def add_time(self, evt, t):
        if evt == "swim":
            self.stime += t
        elif evt == "cycle":
            self.ctime += t
        elif evt == "run":
            self.rtime += t
        self.totalt = self.stime + self.ctime + self.rtime

    def get_time(self, evt):
        if evt == "swim":
            return self.stime
        elif evt == "cycle":
            return self.ctime
        elif evt == "run":
            return self.rtime
