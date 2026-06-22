from collections import deque

N = int(input())
command = []
A = []

for _ in range(N):
    line = input().split()
    command.append(line[0])
    
    if line[0] == "push":
        A.append(int(line[1]))
    else:
        A.append(0)

queue = deque()

for i in range(N):
    if command[i] == "push":
        queue.append(A[i])

    elif command[i] == "pop":
        print(queue.popleft())

    elif command[i] == "size":
        print(len(queue))

    elif command[i] == "empty":
        if len(queue) == 0:
            print(1)
        else:
            print(0)

    elif command[i] == "front":
        print(queue[0])