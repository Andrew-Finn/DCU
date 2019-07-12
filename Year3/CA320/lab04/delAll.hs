delAll :: Eq a => a -> [a] -> [a]
delAll x [] = []
delAll a (l:lt)
    | a == l = delAll a lt
    | otherwise = l : delAll a lt