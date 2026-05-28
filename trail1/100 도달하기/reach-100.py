N = int(input())

arr = [1, N]

while 1:
    num = arr[-1] + arr[-2]
    arr.append(num)

    if num > 100:
        break

for i in arr:
    print(i, end=' ')