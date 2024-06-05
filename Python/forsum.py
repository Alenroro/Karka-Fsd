
sum=0
for i in range(1,6):
    sum=sum+i
print(sum)


a=[]
total=0
for i in range(1,11):
    num=int(input("Enter num "+str(i)))
    a.append(num)
    total=total+i
print(a)
print(total)

cube=0
a=int(input("Enter the start num :"))
b=int(input("Enter the end num :"))
for i in range (a,b):
    cube=(i*i*i)
    print(i+str(cube))
    
