myProduct :: [Int] -> Int
myProduct [] = 1
myProduct (x:y) = x * myProduct y