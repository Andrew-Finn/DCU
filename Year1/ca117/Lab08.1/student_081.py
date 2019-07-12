from collections import namedtuple

Module = namedtuple('Module', 'code title ects')

CA1_MODULES = {'CA103': Module('CA103', 'Computer Systems', 5),
               'CA106': Module('CA106', 'Web Design', 5),
               'CA115': Module('CA115', 'Digital Innovation', 5),
               'CA116': Module('CA116', 'Computer Programming I', 10),
               'CA117': Module('CA117', 'Computer Programming II', 10),
               'CA169': Module('CA169', 'Networks and Internet', 5),
               'CA170': Module('CA170', 'Operating Systems', 5),
               'CA172': Module('CA172', 'Problem Solving', 5),
               'MS121': Module('MS121', 'IT Mathematics', 10)}


class Student(object):
    def __init__(self, idnum, surname, firstname):
        self.idnum = idnum
        self.surname = surname
        self.firstname = firstname
        self.mods = CA1_MODULES
        self.marks = {code: 0 for code in self.mods.keys()}

    def __str__(self):
        name = '{} : {} {}'.format(self.idnum,
                                   self.firstname,
                                   self.surname)
        uline = '-' * len(name)
        results = '\n'.join(
            [code + ' : ' + self.mods[code].title + ' : ' + str(
                self.marks[code]) for code in sorted(self.mods.keys())])

        pm = 'Precision mark: {:.2f}'.format(self.precision_mark())
        if self.passed():
            outcome = 'Pass'
        elif self.passed_by_compensation():
            outcome = 'Pass by compensation'
        else:
            outcome = 'Fail'

        return '\n'.join([name, uline, results, pm, outcome])

    def add_mark(self, modcode, mark):
        self.marks[modcode] = mark

    def precision_mark(self):
        return sum(CA1_MODULES[mod].ects * self.marks[mod] for mod in self.mods) / sum(
            CA1_MODULES[mod].ects for mod in self.mods)

    def passed(self):
        return False not in [mark >= 40 for mark in self.marks.values()]

    def passed_by_compensation(self):
        if self.precision_mark() < 45:
            return False

        if sum(CA1_MODULES[mod].ects for mod in self.mods if self.marks[mod] < 40) > sum(
                CA1_MODULES[mod].ects for mod in self.mods) / 6:
            return False

        if True in map(lambda m: m < 35, self.marks.values()):
            return False

        return True
