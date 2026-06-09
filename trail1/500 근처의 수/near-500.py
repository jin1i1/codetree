arr = list(map(int, input().split()))
a_min = []
a_max = []

for num in arr:
    if num < 500:
        a_min.append(num) # 500미만의 수
    elif num > 500:
        a_max.append(num) # 500 초과의 수

max_val = a_min[0]
for i in range(len(a_min)):
    if a_min[i] >= max_val:
        max_val = a_min[i]

min_val = a_max[0]
for i in range(len(a_max)):
    if a_max[i] <= min_val:
        min_val = a_max[i]

print(max_val, min_val)
