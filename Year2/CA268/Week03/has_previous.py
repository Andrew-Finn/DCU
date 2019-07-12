print("Enter numbers (-1 to end): ", end="")
num = int(input())
a = []
b = []
while num != -1:
    if num in a:
        b.append(num)

    a.append(num)
    num = int(input())

for i in b:
    print(str(i) + " ", end="")

print()
