class PQ:
    def __init__(self):
        self.d = {}
        self.N = 0

    def exch(self, i, j):
        self.d[i], self.d[j] = self.d[j], self.d[i]

    def bigger(self, i, j):
        try:
            return max((i, j), key=lambda x: self.d[x])
        except KeyError:
            return i

    def is_empty(self):
        return self.size() == 0

    def size(self):
        return self.N

    def insert(self, v):
        self.N += 1
        self.d[self.N] = v
        self.swim(self.N)

    def swim(self, n):
        while n > 1 and self.d[n // 2] < self.d[n]:
            self.exch(n, n // 2)
            n //= 2

    def sink(self, n):
        while 2 * n <= self.N:
            i = 2 * n
            i = self.bigger(i, i + 1)
            if self.d[n] >= self.d[i]:
                break

            self.exch(n, i)
            n = i

    def getMax(self):
        return self.d[1]

    def delMax(self):
        v = self.d[1]
        self.exch(1, self.N)
        del self.d[self.N]

        self.N -= 1
        self.sink(1)
        return v
