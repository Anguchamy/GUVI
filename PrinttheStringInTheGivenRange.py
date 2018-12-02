a=input().split()
for i in range(len(a[0])):
    if len(a[0][i:int(a[1])+i])==int(a[1]):
        print(a[0][i:int(a[1])+i])