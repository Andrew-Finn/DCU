isProduct :: Float -> Float -> Float -> Bool
isProduct x y z = (x * y == z) || (x * z == y)|| (y * z == x)
