delFirst :: Eq a => a ->[a] -> [a]
delFirst x [] = []
delFirst a (l:lt) | a == l = lt
                  | otherwise = l : delFirst a lt