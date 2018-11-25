l=[int(a) for a in input().split()]
n=l[0]
a=l[1]
b=l[2]
mid=n//2
res=[]
c=0
r=0
while 1:
   if c%2==0:
       r=r+a
   else:
       r=r+b
   c+=1
   if(r==mid):
       print("YES")
       break;  
   if(r>mid):
       print("NO")
       break;