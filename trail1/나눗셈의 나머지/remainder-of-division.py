A, B = map(int, input().split())
rest = []

while A > 1: 
    rest.append(A % B)
    A //= B

cnt_arr = [0] * 10

for num in rest:
    cnt_arr[num] += 1


sum = 0

for cnt in cnt_arr:
    sum += cnt * cnt

print(sum)