n=[int(a) for a in input().split()]
l=[int(z) for z in input().split()]
m=0
for i in range(n[0]):
    for j in range(n[0]):
        for k in range(n[0]):
            if i<=j and j<=k:
               m=max(m,n[1]*l[i]+n[2]*l[j]+n[3]*l[k])
print(m)