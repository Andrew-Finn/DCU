def even_count(lst):
    count, ptr = 0, lst.head
    while ptr is not None:
        if ptr.item % 2 == 0:
            count += 1
        ptr = ptr.next
    return count
