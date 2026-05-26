arr = list(map(int, input().split()))
list_ = []

for i in arr:
    if i == 0:
        break
    list_.append(i)

for j in range(len(list_)):
    if list_[j] % 2 == 1:   # 홀수
        print(list_[j] + 3, end=' ')
    else:                   # 짝수
        print(list_[j] // 2, end=' ')