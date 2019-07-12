longest :: [[a]] -> [a]
longest [] = []
longest [x] = x
longest (x:y:list)
    | length y > length x = longest(y:list)
    | otherwise = longest(x:list)
