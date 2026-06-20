s = input()
n = int(input())

if n > len(s):
    n = len(s)

for i in range(len(s) - 1, len(s) - n -1, -1):
    print(s[i], end='')