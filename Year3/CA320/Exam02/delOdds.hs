-- Changed solution to make sure im using things we have covered, not sure if we covered list comprhensions

delOdds :: [Int] -> [Int]
delOdds [] = []
delOdds (head:tail)
    | head `mod` 2 == 0 = head:delOdds tail
    | otherwise = delOdds tail