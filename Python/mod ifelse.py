a=int(input())
if(a%3==0 and a%5==0):
    print("It is divisible by 3 and 5")
else:
    print("It is not divisible by 3 and 5")

b=int(input("Enter input:5"))
if(b%2==0):
    print("Even Number")
else:
    print("Odd number")

Mark=int(input())
if(Mark>70):
    print("Good student")
elif(Mark>35 and Mark<70):
    print("Average student")
else:
    print("Poor student")
