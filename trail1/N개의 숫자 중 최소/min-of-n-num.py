n = int(input())
a = list(map(int, input().split()))

min_val = a[0]

for x in a:
    if x < min_val:
        min_val = x

cnt = 0
for x in a:
    if x == min_val:
        cnt += 1

print(min_val, cnt)