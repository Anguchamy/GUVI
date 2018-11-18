a=input()
b=input()
c=""
r=""
for i in range(len(a)):
    c=c+a[i]
    if c in b:
        r=c
print(r)