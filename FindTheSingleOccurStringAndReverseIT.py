a=input()
b=""
c=""
for i in range(len(a)):
    if a[i] not in b:
        c+=a[i]
        b+=a[i]

print(c[::-1])