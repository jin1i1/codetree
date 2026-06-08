N = int(input())
arr = list(map(int, input().split()))
cnt = 0
idx = -1

for i in range(len(arr)):
    if arr[i] == 2:
        idx = i
        cnt += 1
        if cnt == 3:
            print(i+1)
            break




