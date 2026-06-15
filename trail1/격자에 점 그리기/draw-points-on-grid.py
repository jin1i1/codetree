n, m = map(int, input().split())

arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]

for k in range(1, m + 1):
    r, c = map(int, input().split())
    arr[r - 1][c - 1] = k

for i in range(n):
    for j in range(n):
        print(arr[i][j], end=" ")
    print()