arr = list(map(int, input().split()))

arr_sum1 = sum(arr[1::2])
arr_sum2 = 0 
arr_avg = 0
cnt = 0

for i in range(len(arr)):
    if (i+1) % 3 == 0 and i != 0:
        arr_sum2 += arr[i]
        cnt += 1
        
arr_avg = arr_sum2 / cnt

print(arr_sum1, round(arr_avg, 1))