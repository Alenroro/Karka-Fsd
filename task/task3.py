def intersection(num1,num2):
    set1=set(num1)
    set2=set(num2)
    result=list(set1.intersection(set2))
    return result

num1=[1,2,2,1]
num2=[2,2]
output=intersection(num1,num2)
print(output)
