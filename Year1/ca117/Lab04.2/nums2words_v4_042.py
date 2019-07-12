import sys


def main():
    dic_1_to_19 = {0: "zero", 1: "one", 2: "two", 3: "three", 4: "four", 5: "five", 6: "six", 7: "seven", 8: "eight",
                   9: "nine", 10: "ten", 11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen", 15: "fifteen",
                   16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen"}
    dic_tens = {20: "twenty", 30: "thirty", 40: "forty", 50: "fifty", 60: "sixty", 70: "seventy", 80: "eighty",
                90: "ninety", 100: "one hundred"}
    for line in sys.stdin:
        output = ""
        for number in line.strip().split():
            number = int(number)
            if number in dic_1_to_19:
                output += " " + dic_1_to_19[number]
            elif number in dic_tens:
                output += " " + dic_tens[number]
            else:
                output += " " + dic_tens[number // 10 * 10] + "-" + dic_1_to_19[number % 10]
        print(output.lstrip())


if __name__ == '__main__':
    main()
