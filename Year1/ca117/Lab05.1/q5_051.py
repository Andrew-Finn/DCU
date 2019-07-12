import sys

num = []
num_dic = {}
for i in sys.stdin:
    i = int(i)
    num.append(i)
    if i not in num_dic:
        num_dic[i] = 1
    else:
        num_dic[i] += 1
mean = round(sum(num) / len(num), 1)

num.sort()
if len(num) % 2 == 1:
    median = num[int(len(num) / 2)]
else:
    median = (num[int(len(num) / 2)] + num[int(len(num) / 2 - 1)]) / 2

print("Mean: {}".format(mean))
print("Median: {}".format(float(median)))
