n=int(input())
l=[int(x) for x in input().split()]
b=[]
for i in range(len(l)):
    if l.count(l[i])==1:
        print(l[i],end=" ")