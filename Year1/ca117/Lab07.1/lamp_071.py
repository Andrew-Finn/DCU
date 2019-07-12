class Lamp(object):
    def __init__(self, status=False):
        self.on = status

    def turn_on(self):
        self.on = True

    def turn_off(self):
        self.on = False

    def toggle(self):
        if self.on:
            self.on = False
        else:
            self.on = True
