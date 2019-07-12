def detect_loop(lst):
    root = lst.head
    pointer = lst.head
    while pointer:
        if pointer.next and pointer.next == root:
            return True
        pointer = pointer.next
    return False
