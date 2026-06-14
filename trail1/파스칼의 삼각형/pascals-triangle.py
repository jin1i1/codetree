N = int(input())

arr = [
    [0 for _ in range(N)]
    for _ in range(N)
]

for i in range(N):
    for j in range(i + 1):
        if j == 0 or j == i:
            arr[i][j] = 1
        else:
            arr[i][j] = arr[i-1][j-1] + arr[i-1][j]

for i in range(N):
    for j in range(i + 1):
        print(arr[i][j], end=' ')
    print()