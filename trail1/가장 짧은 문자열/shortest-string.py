str1 = input()
str2 = input()
str3 = input()

str1_l = len(str1)
str2_l = len(str2)
str3_l = len(str3)
asl = [str1_l, str2_l, str3_l]

max_str = asl[0]
min_str = asl[0]

for i in range(3):
    if asl[i] > max_str:
        max_str = asl[i]
    elif asl[i] < min_str:
        min_str = asl[i]

res = max_str - min_str
print(res)
