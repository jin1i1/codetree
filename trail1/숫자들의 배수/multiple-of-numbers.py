N = int(input())

arr = []
i = 1
cnt = 0

while True:
    arr.append(N * i)
    print(arr[i - 1], end=' ')

    if arr[i - 1] % 5 == 0:
        cnt += 1

    if cnt == 2:
        break

    i += 1