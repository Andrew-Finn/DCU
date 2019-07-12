import calendar
import sys


def main():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    poem = ["Monday's child is fair of face.", "Tuesday's child is full of grace.", "Wednesday's child is full of woe.",
            "Thursday's child has far to go.", "Friday's child is loving and giving.",
            "Saturday's child works hard for a living.", "Sunday's child is fair and wise and good in every way."]
    day = calendar.weekday(int(sys.argv[3]), int(sys.argv[2]), int(sys.argv[1]))
    print("You were born on a", days[day] + " and", poem[day])


if __name__ == '__main__':
    main()
