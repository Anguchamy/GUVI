n=int(input())
l=[int(x) for x in input().split()]
b=[]
for i in range(len(l)):
    if l[i]<0:
        if l[i]*-1 in l:
            print(l[i]*-1,l[i])