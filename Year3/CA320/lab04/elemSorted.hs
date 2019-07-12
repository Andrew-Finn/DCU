elemSorted :: Ord a => a -> [a] -> Bool
elemSorted x [] = False
elemSorted x (l:lt)
          | (x == l) = True
          | (x < l) = False
          | otherwise = elemSorted x lt