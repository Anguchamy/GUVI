n=input()
c=['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z']
v=['a','e','i','o','u']

if(n in v):
    print("Vowel")
elif(n in c):
    print("Consonant")
else:
    print("invalid")