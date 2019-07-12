def Partition(A, p, q):
    i = p
    x = A[i]
    for j in range(p + 1, q + 1):
        if A[j] <= x:
            i = i + 1
            tmp = A[j]
            A[j] = A[i]
            A[i] = tmp
    l = A[p]
    A[p] = A[i]
    A[i] = l
    return i


def quicksort(A, p, q):
    if p < q:
        r = Partition(A, p, q)
        quicksort(A, p, r - 1)
        quicksort(A, r + 1, q)
    return A
