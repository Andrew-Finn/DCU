isSum :: Int -> Int -> Int -> Bool
isSum x y z
	| y + z == x = True
	| x + y == z = True
	| x + z == y = True
	| otherwise = False