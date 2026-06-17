str = input()
a = input()
cnt = 0

for i in range(len(str)):
    if str[i] == a:
        cnt += 1

print(cnt)