a=input().split()
n=int(a[0])
k=int(a[1])
l=[int(x) for x in input().split()]
l.sort()
print(l[-k])