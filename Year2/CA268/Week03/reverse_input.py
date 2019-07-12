import sys


def reverse_input(stack):
    # Your code here
    # Read the input
    # place on the stack
    # print from the stack
    for line in sys.stdin:
        stack.push(line.strip())
    while not stack.is_empty():
        print(stack.pop())
