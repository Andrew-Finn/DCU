import numpy as np


def sol():
    np.random.seed(30)
    return np.random.randn(6, 1)


if __name__ == '__main__':
    print(sol())
