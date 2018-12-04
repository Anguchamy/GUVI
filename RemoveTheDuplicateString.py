a=input()
s=""
b=""
for i in range(len(a)):
    if a.count(a[i])>1:
        if a[i] not in b:
            b+=a[i]
            s+=a[i]
    else:
        s+=a[i]
print(s)