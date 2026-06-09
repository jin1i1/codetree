N1, N2 = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split())) 

for i in range(N1):

    if A[i] == B[0]:

        cnt = 0

        for j in range(N2):
            if i + j >= N1:
                break
            
            if A[i+j] == B[j]:
                cnt += 1
            else:
                break
        if cnt == N2:
            print('Yes')
            break
else:
    print('No')
