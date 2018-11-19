a=input().split()
r=0;
n=int(a[0])
m=int(a[1])
ln=[int(x) for x in input().split()]
lm=[int(x) for x in input().split()]
for i in range(len(lm)):
    if(lm[i] not in ln):
        r=1;
        break;
if r==0:
    print("YES")
else:
    print("NO");
        