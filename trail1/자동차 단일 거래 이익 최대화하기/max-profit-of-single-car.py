n = int(input())
price = list(map(int, input().split()))

min_num = 0
max_num = 0
bene = []

for i in range(n):
    for j in range(i+1, n):
        # if i+j == n:
        #     break
        if price[i] < price[j]:
            max_num = price[j]
            min_num = price[i]
            bene.append(max_num - min_num)
        elif price[i] > price[j]:
            continue
            if j == N-1:
                print(0)
                break
            
            
    
    max_val = 0

    for q in range(len(bene)):
        if bene[q] > max_val:
            max_val = bene[q]
            

print(max_val)