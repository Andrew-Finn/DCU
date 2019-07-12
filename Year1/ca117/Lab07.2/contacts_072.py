class Contact:
    def __init__(self, name, phone, email):
        self.name = name
        self.phone = phone
        self.email = email

    def __str__(self):
        return " ".join([self.name, self.phone, self.email])


class ContactList:
    def __init__(self):
        self.dic = {}

    def add_contact(self, c):
        self.dic[c.name] = c

    def del_contact(self, name):
        if name in self.dic:
            del self.dic[name]

    def get_contact(self, name):
        if name in self.dic:
            return self.dic[name]
        return "{} : No such contact".format(name)

    def __str__(self):
        contacts = "\n".join(sorted(map(str, self.dic.values())))
        return "Contact list\n------------\n{}".format(contacts)
