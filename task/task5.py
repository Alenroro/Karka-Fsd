def duplicate_zeros(a):
    i=0
    while i<len(a):
        if a[i]==0:
            a.insert(i+1,0)
            a.pop()  
            i+=2  
        else:
            i+=1

a = [1,0,2,3,0,4,5,0,8,9,7]
duplicate_zeros(a)
print(a)
