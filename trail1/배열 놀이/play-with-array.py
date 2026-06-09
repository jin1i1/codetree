N, Q = map(int, input().split())
arr = list(map(int, input().split()))
cnt=0

for i in range(Q):
    Q_arr = list(map(int, input().split()))

    if Q_arr[0] == 1:
        a = Q_arr[1]
        print(arr[a-1])

    elif Q_arr[0] == 2:
        b = Q_arr[1]
        for j in range(N):
            if arr[j] == b:
                idx = j + 1
                cnt += 1
                if cnt >= 1:
                    print(idx)
                    break
        else:
            print(0)

            
    elif Q_arr[0] == 3:
        s = Q_arr[1]
        e = Q_arr[2]
        for q in range(s-1, e):
            print(arr[q], end = ' ')
        print()


