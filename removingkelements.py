nk=input().split()
n=int(nk[0])
k=int(nk[1])
l=[int(a) for a in input().split()]
a=list()
if(l.count(k)==0):
    print("empyt")
else:
    for i in range(n):
        if(l[i]!=k):
            a.append(l[i])
if(len(a)!=0):
    print(a)