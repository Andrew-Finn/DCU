repAll :: Eq a => a -> a -> [a] ->[a]
repAll a y [] =[]
repAll x y (l:lt)
    | (l == x) = y : repAll x y lt
    | otherwise = l : repAll x y lt