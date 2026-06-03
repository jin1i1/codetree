cnt = [0] * 5

for _ in range(3):
    s, t = input().split()
    t = int(t)

    if t >= 37 and s == 'Y':
        num = 1
    elif t >= 37:
        num = 2
    elif s == 'Y':
        num = 3
    else:
        num = 4

    cnt[num] += 1

for i in range(1,5):
    print(cnt[i], end = ' ')

if cnt[1] >= 2:
    print('E')
    