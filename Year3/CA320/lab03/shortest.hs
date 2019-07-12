shortest :: [[a]] -> [a]
shortest [] = []
shortest [x] = x
shortest (x:y:list)
    | length x > length y = shortest(y:list)
    | otherwise = shortest(x:list)
