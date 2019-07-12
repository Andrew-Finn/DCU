type Person = (Float, Float)
data BMI = VSUnderweight | SUnderweight | Underweight | Normal | Overweight | MObese | SObese | VSObese
    deriving (Enum, Show)

bmiCalculator :: Person -> BMI
bmiCalculator  (weight, height)
    | bmi_index < 15.0 = VSUnderweight
    | bmi_index < 16.0 = SUnderweight
    | bmi_index < 18.5 = Underweight
    | bmi_index < 25.0 = Normal
    | bmi_index < 30.0 = Overweight
    | bmi_index < 35.0 = MObese
    | bmi_index < 40.0 = SObese
    | otherwise = VSObese
    where bmi_index = weight / height ^ 2
