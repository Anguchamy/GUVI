n=int(input())
l=[int(a) for a in input().split(" ")]
for i in range(len(l)):
    if(l.count(l[i])==1):
        print(l[i])
        break;