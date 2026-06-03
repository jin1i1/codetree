arr = list(map(int, input().split()))

max_val = 0
for x in arr:
    if x > max_val:
        max_val = x

print(max_val)