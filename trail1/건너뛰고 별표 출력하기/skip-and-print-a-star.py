N = int(input())

for i in range(1, N):
    for j in range(i):
        print('*', end = '')
    print()
    print()


for i in range(N):
    for j in range(N - i):
        print('*', end = '')
    print()
    print()
    