def check_brackets(line):
    brackets = [('(', ')'), ('[', ']'), ('{', '}'), ('<', '>')]
    s = 0
    e = 1
    st = Stack()

    for i in line:
        for pair in brackets:
            if i == pair[s]:
                st.push(i)
            elif i == pair[e] and not st.isEmpty() and st.pop() != pair[s]:
                return False

    if st.isEmpty():
        return True
    else:
        return False
