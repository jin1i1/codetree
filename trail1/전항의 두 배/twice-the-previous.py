A, B = map(int, input().split())
arr = [A, B]
i = 2
j = 0

while j < 10:
    num = arr[i-1] + 2 * arr[i-2]
    arr.append(num)
    
    print(arr[j], end = ' ')
    i += 1
    j += 1