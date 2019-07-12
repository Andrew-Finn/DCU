data Day = Monday | Tuesday | Wednesday | Thursday | Friday | Saturday | Sunday
    deriving (Enum, Show)

data Month = Jan | Feb | Mar | Apr | May | Jun | Jul | Aug | Sep | Oct | Nov | Dec
    deriving (Enum, Read)

type Date = (Int, Month, Int)

leap :: Int -> Bool
leap year
   | year `mod` 100 == 0 = year `mod` 400 == 0
   | year `mod` 4 == 0 = True
   | otherwise = False

mLengths :: Int -> [Int]
mLengths x = [31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
            where
            feb = if leap x then 29 else 28

--Does not work work for first example ....
numDays :: Date -> Int
numDays (day, month, year)
    = day + (sum(take(fromEnum month) (mLengths year)) + (year - 1753) * 365) + (length [year | year <- [1753..year - 1], leap year])

    -- Day + month + year = total