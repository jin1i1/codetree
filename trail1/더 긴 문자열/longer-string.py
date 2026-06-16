str1, str2 = input().split()

str1_l = len(str1)
str2_l = len(str2)

if str1_l > str2_l:
    print(str1, str1_l)
elif str1_l < str2_l:
    print(str2, str2_l)
elif str1_l == str2_l:
    print("same")