s_username="emc"
s_password="123"

username=input("USERNAME: ")
password=input("PASSWORD: ")

def validate():
    if(s_username==username and s_password==password):
        return ("you are logged in")
    else:
        return ("The given credantials are incorrect")

a=validate()
print(a)


b=int(input("A: "))
c=int(input("B: "))
d=int(input("c: "))

def add(n1,n2):
    return n1+n2

sum=add(b,c)
print("sum= ",sum)

output=sum*d
print(output)
