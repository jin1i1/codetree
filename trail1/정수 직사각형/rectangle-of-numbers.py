N, M = map(int, input().split())
arr = [
    [0 for _ in range(M)]
    for _ in range(N)
]

num = 0
for i in range(N):
    for j in range(M):
        num += 1
        arr[i][j] = num

for row in arr:
    for elem in row:
        print(elem, end = ' ')
    print()