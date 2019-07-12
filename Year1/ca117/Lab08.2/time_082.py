class Time(object):
    count = 0

    def __init__(self, hour=0, minute=0, second=0):
        self.hour = hour
        self.minute = minute
        self.second = second
        Time.count += 1

    def __eq__(self, other):
        return (self.hour, self.minute, self.second) == (other.hour, other.minute, other.second)

    def __add__(self, other):
        return seconds_to_time(self.time_to_seconds() + other.time_to_seconds())

    def __gt__(self, other):
        return self.time_to_seconds() > other.time_to_seconds()

    def __iadd__(self, other):
        z = self + other
        self.hour, self.minute, self.second = z.hour, z.minute, z.second
        return self

    def __str__(self):
        return 'The time is {:02d}:{:02d}:{:02d}'.format(self.hour, self.minute, self.second)

    def time_to_seconds(self):
        return self.hour * 60 * 60 + self.minute * 60 + self.second

    def seconds_to_time(s):
        minute, second = divmod(s, 60)
        hour, minute = divmod(minute, 60)
        overflow, hour = divmod(hour, 24)
        return Time(hour, minute, second)


def seconds_to_time(s):
    minute, second = divmod(s, 60)
    hour, minute = divmod(minute, 60)
    overflow, hour = divmod(hour, 24)
    return Time(hour, minute, second)
