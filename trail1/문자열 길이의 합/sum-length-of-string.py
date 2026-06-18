N = int(input())

length_sum = 0
cnt = 0

for _ in range(N):
    s = input()
    length_sum += len(s)

    if s[0] == 'a':
        cnt += 1

print(length_sum, cnt)