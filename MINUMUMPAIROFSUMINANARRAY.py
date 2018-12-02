n=int(input())
l=[int(a) for a in input().split(" ")]
res=[]
for i in range(len(l)):
    for j in range(len(l)):
        if(i!=j):
            res.append(l[i]+l[j])

m=0
if(m in res):
    print(m)
else:
    i=0
    while(1):
        i+=1
        if(m-i in res):
            m=m-i
            break;
        elif(m+i in res):
            m=m+i
            break;

for i in range(len(l)):
    for j in range(len(l)):
        if(i!=j):
            if(l[i]+l[j]==m):
                print(l[i],l[j])
                m=1000
                break;
    if(m==1000):
        break