import numpy as np


def sol():
    # Input data
    X = np.array(([3, 5], [5, 1], [10, 2]), dtype=float)

    # output vector
    y = np.array(([75], [82], [93]), dtype=float)

    # scale the input and output data
    X = X / np.amax(X, axis=0)
    y = y / 100

    # define network parameters
    size_input = np.shape(X)[1]  # number of columns of X
    size_hidden = 3
    size_output = 1

    # Create the weights
    np.random.seed(30)
    W1 = np.random.randn(size_input, size_output)

    # A dot product of the weights by the inputs provides the values for the next layer (z)
    z2 = np.dot(X, W1)
    z2 = X * W1
    return z2


if __name__ == '__main__':
    print(sol())
