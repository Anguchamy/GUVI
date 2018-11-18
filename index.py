n=int(input())
l=[int(x) for x in input().split()]
b=[]
for i in range(len(l)):
    if(l[i]==i):
        print(l[i],end=" ")