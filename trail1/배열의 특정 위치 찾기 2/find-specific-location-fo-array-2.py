arr = list(map(int, input().split()))

sum_1 = 0
sum_2 = 0

for i in range(len(arr)):
    if i % 2 == 0:
        sum_1 += arr[i]
    else:
        sum_2 += arr[i]

if sum_1 > sum_2:
    res = sum_1 - sum_2
else:
    res = sum_2 - sum_1

print(res)
