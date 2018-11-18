n=int(input())
l=[int(x) for x in input().split()]
l.sort()
l.reverse()
str="".join(str(x) for x in l)
print(str)