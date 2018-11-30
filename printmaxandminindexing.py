n=int(input())
l=[int(a) for a in input().split()]
print(l.index(min(l))+1,end=" ")
print(l.index(max(l))+1)