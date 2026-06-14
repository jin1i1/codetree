n = 5
add = [
    [0 for _ in range(n)]
    for _ in range(n)
]

for j in range(n):
    add[0][j] = 1

for i in range(n):
    add[i][0] = 1

for i in range(1, n):
    for j in range(1, n):
        add[i][j] = add[i-1][j] + add[i][j-1]

for row in add:
    for elem in row:
        print(elem, end=" ")
    print()