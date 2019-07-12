import numpy as np


def sigmoid(z):
    return 1 / (1 + np.exp(-z))


def sol():
    x = np.array([
        [0.91, 0.98, 0.56, ],
        [0.08, 0.47, 0.72, ],
    ])
    z = sigmoid(x)
    return z


if __name__ == '__main__':
    print(sol())
