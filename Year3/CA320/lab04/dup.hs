dup :: Eq a => [a] -> Bool
dup [] = False
dup [l] = False
dup (l:ls)
    | (elem l ls == True) = True
    | otherwise = dup(ls)