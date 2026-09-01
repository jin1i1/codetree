n, k = map(int, input().split())
commands = [tuple(map(int, input().split())) for _ in range(k)]

arr = [0] * n;

for a, b in commands:
    for i in range(a - 1, b):
        arr[i] += 1


max = arr[0]
for i in range(1,n):
    if (max < arr[i]):
        max = arr[i]
    else:
        continue

print(max)

