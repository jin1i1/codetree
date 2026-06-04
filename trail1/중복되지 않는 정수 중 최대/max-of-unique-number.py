n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.
max_val = -1

for i in range(n):
    cnt = 0

    for j in range(n):
        if nums[i] == nums[j]:
            cnt += 1

    if cnt == 1 and nums[i] > max_val:
        max_val = nums[i]

print(max_val)
    
