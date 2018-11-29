def fun(a,b):
    for i in range(b):
        print(a,end="")


a=input()
digit=[]
c=""
char=[]
d=0
for i in range(len(a)):
    if a[i].isdigit():
        c+=a[i]
        d=1
    elif a[i].isalpha() and d==1:
        digit.append(c)
        d=0
        c=""
if(len(c)!=0):
    digit.append(c)

for i in range(len(a)):
    if a[i].isalpha():
        char.append(a[i])

for i in range(len(char)):
    fun(char[i],int(digit[i]))
