salary=int(input("Enter your salary :"))
age=int(input("Enter Your age :"))
if(salary>=20000 or age<=25):
    loan=int(input("Enter the loan amount :"))
    if(loan<=50000):
        print("you are eligible for loan")
    else:
        print("sorry,The maximum loan amount is 50000")
else:
    print("you are not eligible for loan")
