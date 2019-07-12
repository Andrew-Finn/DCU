from stack_092 import Stack

left = '({['
right = ')}]'
mapping = {v: k for k, v in zip(left, right)}


def matcher(s):
    stk = Stack()
    for e in s:
        if e in left:
            stk.push(e)
        try:
            if e in right and stk.top() == mapping[e]:
                stk.pop()
        except IndexError:
            return False

    if stk.is_empty():
        return True
    return False
