sumPoly :: [Int] -> [Int] -> [Int]
sumPoly [] b = b
sumPoly a [] = a
sumPoly (a:a1) (b:b1) = a + b : sumPoly a1 b1