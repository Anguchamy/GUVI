n=int(input())
l=[int(a) for a in input().split()]
c=0
for i in range(len(l)):
    if(c==0):
        print(max(l),end=" ")
        l.remove(max(l))
        c=1;
    else:
        print(min(l),end=" ")
        l.remove(min(l))
        c=0