N = int(input())
arr = list(map(int, input().split()))
enum = []

for i in range(N):
    if arr[i] % 2 == 0:
        enum.append(arr[i])

for j in enum:
    print(j, end = ' ')