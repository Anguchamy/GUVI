x=[]
y=[]
c=0
for i in range(4):
    n=[int(x) for x in input().split()]
    x.append(n[0])
    y.append(n[1])
for i in range(len(x)):
    if x.count(x[i])==2 and y.count(y[i])==2:
        continue
    else:
        c=1
        break;
if(c==0):
    print("yes")
else:
    print("no")