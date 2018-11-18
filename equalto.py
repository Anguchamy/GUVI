n=int(input())
l=[int(x) for x in input().split()]
b=[]
for i in range(len(l)):
    for j in range(i+1,len(l)):
        for k in range(j+1,len(l)):
            if l[i]+l[j]==l[k]:
                print(l[i],l[j],l[k]);