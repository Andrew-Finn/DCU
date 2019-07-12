numSorted :: Ord a => a -> [a] -> Int
numSorted y [] = 0
numSorted y (x:xs)
    | y == x = 1 + (numSorted y xs)
    | y < x = 0
    | otherwise = numSorted y xs