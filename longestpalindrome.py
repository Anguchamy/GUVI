a=input()
c=0
for i in range(len(a)):
    if a.count(a[i])%2!=0:
        c+=1
print(c)