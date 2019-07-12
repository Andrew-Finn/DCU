delAll :: Eq a => a -> [a] -> [a]
delAll l list = [x | x <- list, l /= x]