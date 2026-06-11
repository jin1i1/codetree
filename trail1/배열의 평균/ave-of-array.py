arr = [list(map(int, input().split())) for _ in range(2)]

for i in range(2):
    total = 0
    avg = 0
    for j in range(4):
        total += arr[i][j]
    avg = total / 4
    print(round(avg, 1), end=' ')
print()
    
for i in range(4):
    total = 0
    avg = 0
    for j in range(2):
        total += arr[j][i]
    avg = total / 2
    print(round(avg, 1), end = ' ')


print()
total = 0
for i in range(2):
    for j in range(4):
        total += arr[i][j]
avg = total / 8
print(round(avg, 1))