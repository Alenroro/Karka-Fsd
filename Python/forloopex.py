for i in range(2,56):
    print(i)

a=int(input("A="))
b=int(input("B="))
for i in range(a,b):
    print(i)

for i in range(1,11):
    if(i%2!=0):
        print(i)

ecount=0
ocount=0
for i in range(1,11):
    if(i%2==0):
       ecount+=1
       ocount+=1
print("Even :",ecount)
print("odd :",ocount)


count=0
for i in range(1,101):
    if(i%3==0 and i%5==0):
        count+=1
print(count)
