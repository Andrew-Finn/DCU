dupSorted :: Eq a => [a] -> Bool
dupSorted [] = False
dupSorted [x] = False
dupSorted (x:l:lt)
        | x == l = True
        | otherwise = dupSorted (l:lt)