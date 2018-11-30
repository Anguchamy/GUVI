y=input().split()
a=y[0]
b=y[1]
z=""
x=""
res=list()
for i in range(0,len(a),1):
    z+=a[i]
    if(z in b):
        for j in range(i+1,len(a),1):
            z+=a[j]
            if z in b:
                x=z
                continue
            else:
                res.append(x)
                z=""
                break;
        if j==len(a)-1:
            break
    else:
        z=""

m=0
for i in range(len(res)):
    m=max(len(res[i]),m)

if(len(res)==0 or m>1):
    print("yes")
else:
    print("no")