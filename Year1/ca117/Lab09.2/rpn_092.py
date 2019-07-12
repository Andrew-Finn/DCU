from math import sqrt

from stack_092 import Stack


def add(x, y):
    return x + y


def subtract(x, y):
    return x - y


def multiply(x, y):
    return x * y


def divide(x, y):
    return x / y


def negate(x):
    return -x


def calculator(line):
    binops = {'+': add, '-': subtract, '*': multiply, '/': divide}
    uniops = {'n': negate, 'right': sqrt}
    stk = Stack()
    for e in line.split():
        if e in binops.keys():
            y = stk.pop()
            x = stk.pop()
            stk.push(binops[e](x, y))
        elif e in uniops.keys():
            stk.push(uniops[e](stk.pop()))
        else:
            stk.push(float(e))
    return stk.top()
