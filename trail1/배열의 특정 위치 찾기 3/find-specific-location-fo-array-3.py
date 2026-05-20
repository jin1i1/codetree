arr = list(map(int, input().split()))
nums = []

for num in arr:
    if num == 0:
        break
    nums.append(num)

sum = nums[-1] + nums[-2] + nums[-3]

print(sum)