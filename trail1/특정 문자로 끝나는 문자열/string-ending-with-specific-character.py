arr = []

for _ in range(10):
    s = input()  
    arr.append(s)

ch = input()
cnt = 0

for i in range(10):
    if arr[i][-1] == ch:
        print(arr[i])
        cnt += 1

if cnt == 0:
    print("None")