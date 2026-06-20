n = int(input())

arr = []
for _ in range(n):
    arr.append(input())

a = input()

cnt = 0
total_len = 0

for i in range(n):
    if arr[i][0] == a:
        cnt += 1
        total_len += len(arr[i])

avg = total_len / cnt

print(cnt, format(avg, ".2f"))