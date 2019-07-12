class Student(object):
    def __init__(self, surname, forename, student_number, modlist=None):
        self.surname = surname
        self.forename = forename
        self.student_number = student_number
        if modlist is None:
            modlist = []
        self.modlist = modlist

    def add_module(self, arg):
        self.modlist.append(arg)

    def del_module(self, arg):
        if arg in self.modlist:
            self.modlist.remove(arg)

    def print_details(self):
        print("ID: " + str(self.student_number))
        print("Surname: " + self.surname)
        print("Forename: " + self.forename)
        print("Modules: " + " ".join(self.modlist))
