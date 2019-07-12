leap :: Int -> Bool
leap year
   | year `mod` 100 == 0 = year `mod` 400 == 0
   | year `mod` 4 == 0 = True
   | otherwise = False