import numpy as np


class NeuralNetwork(object):
    def __init__(self, size_input, size_hidden, size_output, seed=30):
        np.random.seed(seed)
        self.W1 = np.random.randn(size_input, size_hidden)
        self.W2 = np.random.randn(size_hidden, size_output)


def sol():
    NN = NeuralNetwork(2, 3, 1)
    return (NN.W1, NN.W2)


if __name__ == '__main__':
    print(sol())
