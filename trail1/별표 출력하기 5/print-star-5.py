N = int(input())

for i in range(N):
    for j in range(N-i):
        print('*' * (N-i) , end = ' ')
    print()