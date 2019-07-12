fibonacci :: Int -> Int
fibonacci n
	| n <= 1 = 0
	| n == 2 = 1
	| otherwise = fibonacci (n - 2) + fibonacci (n - 1)
