n=int(input())
l=[int(x) for x in input().split()]
b=[]
c=[]
for i in range(len(l)):
    if l[i] not in b:
        b.append(l[i])
        if l.count(l[i])>1:
            print(l.count(l[i]),end=" ")