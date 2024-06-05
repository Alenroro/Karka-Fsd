def findoddoreven(a):
    if(a%2==0):
        print("The Number is EVEN")
    else:
        print("The Number is odd")
findoddoreven( a=int(input("Enter the input: ")))

def passorfail():
    b=int(input("Enter the mark: "))
    if(b>=50):
        print("Pass")
    else:
        print("Fail")
passorfail()

def printrange():
    a=int(input("Enter a: "))
    b=int(input("Enter b: "))
    for i in range(a,b):
        print(i)
printrange()
