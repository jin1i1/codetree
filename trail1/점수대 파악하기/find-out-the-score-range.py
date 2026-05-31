arr = list(map(int, input().split()))
cnt = [0] * 11

for num in arr:
    if num == 0:
        break
    cnt[num // 10] += 1

for i in range(10, 0, -1):
    print(i * 10, "-", cnt[i])