def fun(n):
    a=""
    for i in range(len(n)-1,-1,-1):
        a+=n[i]
    return a

n=input()
print(fun(n))