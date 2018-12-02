def fun(a):
    f=0;
    for i in range(len(a)):
        if(a[i]=='3' or a[i]=='4'):
            f=f+1;
    
    if(f==len(a)):
        return 1;
    else:
        return 0;
        
n=int(input())
c=0;
i=3;
while(1):
    a=fun(str(i))
    if(a==1):
        c+=1;
    
    if(c==n):
        print(i)
        break
    else:
        i+=1