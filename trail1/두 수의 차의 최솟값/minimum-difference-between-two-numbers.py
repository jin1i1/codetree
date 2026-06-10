N = int(input())
arr = list(map(int, input().split()))

min_num = 0
max_num = 0
sub_arr = []

for i in range(N):
    if i+1 == N:
        break
    elif arr[i] < arr[i+1]:
        max_num = arr[i+1]
        min_num = arr[i]
    elif arr[i] > arr[i+1]:
        max_num = arr[i]
        min_num = arr[i+1]
    sub_arr.append(max_num - min_num)


min_val = sub_arr[0]

for i in range(len(sub_arr)):
    if sub_arr[i] < min_val:
        min_val = sub_arr[i]

print(min_val)


