nk=input().split()
n=int(nk[0])
k=int(nk[1])
l=[int(a) for a in input().split()]
j=0
res=[]
r=[]
for i in range(n):
    if(j==k):
        res.append(r)
        r=[]
        j=1
        r.append(l[i])
    else:
        r.append(l[i])
        j+=1
if(len(r)!=0):
    res.append(r)
r=[]

if(len(res)==1):
    print(max(res[0]))
else:
    for i in range(len(res)):
        r.append(min(res[i]))
    print(max(r))