str1 = input()
str2 = input()
arr = []

for i in range(len(str1)):
    if str1[i] != " ":
        arr.append(str1[i])

for i in range(len(str2)):
    if str2[i] != " ":
        arr.append(str2[i])

for i in range(len(arr)):
    print(arr[i], end = '')