m1, d1, m2, d2 = map(int, input().split())

num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

total_date = 0

date1 = num_of_days[m1] - d1 + 1
total_date += date1

for i in range(m1 + 1, m2):
    total_date += num_of_days[i]

if m1 != m2:
    total_date += d2
else:
    total_date = d2 - d1 + 1

print(total_date)