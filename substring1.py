n=int(input())
l=[]
for i in range(n):
    l1=input()
    l.append(l1)
a=l[0]
b=l[1]
c=""
r=""
for i in range(len(a)):
    c=c+a[i]
    if c in b:
        r=c
print(r)