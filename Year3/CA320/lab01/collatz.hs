-- This Haskell program calculates the series if numbers in a Collatz sequence
-- from the given positive number until the number 1 is reached.

-- collatz calculates the next number after the given one in the Collatz sequence

collatz :: Integer -> Integer

collatz n | even n    = n `div` 2
          | otherwise = 3 * n + 1

-- collatzSeq produces the Collatz sequence for a given non-zero positive integer

collatzSeq :: Integer -> [Integer]

collatzSeq n | n <= 0    = error "Integer must be positive"
             | n == 1    = [1]
             | otherwise = n : collatzSeq (collatz n)

-- maxSeq gives the length of the longest Collatz sequence from 1 up to the given number

maxSeq :: Integer -> Int

maxSeq n | n <= 0    = error "Integer must be positive"
         | otherwise = maximum (map (length.collatzSeq) [1..n])
         


