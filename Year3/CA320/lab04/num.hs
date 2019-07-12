num :: Eq a => a -> [a] -> Int
num x [] = 0
num x (l:lt) | x == l = 1 + (num x lt)
             | otherwise = num x lt