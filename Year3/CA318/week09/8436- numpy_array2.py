import numpy as np


def sol():
    return np.array([np.array(xi) for xi in [
        [0.91, 0.98, 0.56, ],
        [0.08, 0.47, 0.72, ],
    ]])


if __name__ == '__main__':
    print(sol())
