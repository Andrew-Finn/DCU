-- This Haskell program defines functions for a sphere
-- function square returns the square of the input value
square :: Float -> Float
square x = x * x

-- function cube returns the cube of the input value
cube :: Float -> Float
cube x = x * x * x

-- function volume returns the volume of the sphere with the given radius
volume :: Float -> Float
volume r = (4.0 * pi * cube r)/3.0

-- function surfaceArea returns the surface area of the sphere with the given radius
surfaceArea :: Float -> Float
surfaceArea r = 4.0 * pi * square r
