arr = list(map(int, input().split()))

for i in range(1,7):
    cnt = 0
    for num in arr:
        if num == i:
            cnt += 1
    
    print(i, "-", cnt)