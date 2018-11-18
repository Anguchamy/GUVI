n=int(input())
l=[int(x) for x in input().split()]
b=[]
for i in range(len(l)):
    if l[i]%2==0 and i%2!=0:
        print(l[i],end=" ")
    elif l[i]%2!=0 and i%2==0:
        print(l[i],end=" ")