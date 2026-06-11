arr = [list(input().split()) for _ in range(5)]
sa = []
ca = []

for i in range(5):
    row = []
    for j in range(3):
        row.append(ord(arr[i][j])-32)
    sa.append(row)

for i in range(5):
    row = []
    for j in range(3):
        row.append(chr(sa[i][j]))
    ca.append(row)

for i in range(5):
    for j in range(3):
        print(ca[i][j], end = ' ')
    print()


