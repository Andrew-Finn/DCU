sumPoly :: [Int] -> [Int] -> [Int]
sumPoly [] b = b
sumPoly a [] = a
sumPoly (a:a1) (b:b1) = a + b : sumPoly a1 b1


evalPoly :: Int -> [Int] -> Int
evalPoly a [] = 0
evalPoly b (a:a1) = a + b * (evalPoly b a1)