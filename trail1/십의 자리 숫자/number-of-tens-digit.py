arr = list(map(int, input().split()))
cnt = [0] * 10

for num in arr:
    if num == 0:
        break
    ten = num // 10
    cnt[ten] += 1

for i in range(1, 10):
    if cnt[i] >= 0:
        print(i, "-", cnt[i])