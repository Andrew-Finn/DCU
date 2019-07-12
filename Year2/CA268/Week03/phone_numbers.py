import sys

dic = {}
print("Enter a name and number, or a name and ? to query (!! to exit)")
for line in sys.stdin:
    line = line.strip()
    if line == "!!":
        print("Bye")
        break
    elif "?" in line:
        line = line.split()
        if line[0] in dic:
            print("{} has number {}".format(line[0], dic[line[0]]))
        else:
            print("Sorry, there is no {}".format(line[0]))
    else:
        line = line.split()
        dic[line[0]] = line[1]
