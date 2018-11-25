def hcfnaive(a,b): 
    if(b==0): 
        return a 
    else: 
        return hcfnaive(b,a%b)
    
nq=input().split()
n=int(nq[0])
q=int(nq[1])
l=[int(a) for a in input().split()]
for i in range(q):
    c=[int(a) for a in input().split()]
    print(hcfnaive(l[c[0]-1],l[c[1]-1]))