reverseOf :: [a] -> [a]
reverseOf [] = []
reverseOf (head:tail) = reverseOf tail ++ [head]

isPalindrome :: Eq a => [a] -> Bool
isPalindrome l
            | l == reverseOf l = True
            | otherwise = False