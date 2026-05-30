N = int(input())
arr = list(map(int, input().split()))

for i in range(1,10):
    cnt = 0
    for num in arr:
        if num == i:
            cnt += 1
    
    print(cnt)


