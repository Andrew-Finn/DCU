num :: Eq a => a -> [a] -> Int
num y [] = 0
num y (x:xs)
    | y == x = 1 + (num y xs)
    | otherwise = num y xs