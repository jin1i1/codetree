n = int(input())
a = list(map(int, input().split()))

first = a[0]
second = a[1]

if first < second:
    first, second = second, first

for i in range(2, n):
    if a[i] > first:
        second = first
        first = a[i]
    elif a[i] > second:
        second = a[i]

print(first, second)
