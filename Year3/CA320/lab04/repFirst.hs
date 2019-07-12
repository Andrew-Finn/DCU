repFirst :: Eq a => a -> a -> [a] -> [a]
repFirst x y [] = []
repFirst x y (l:lt)
       | (l == x) = y:lt
       | otherwise = l : repFirst x y lt