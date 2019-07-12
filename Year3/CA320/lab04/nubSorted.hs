nubSorted :: Ord a => [a] -> [a]
nubSorted [] = []
nubSorted [x] = [x]
nubSorted (x:l:lt)
        | x == l = nubSorted(l:lt)
        | otherwise = x:nubSorted(l:lt)