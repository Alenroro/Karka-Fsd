def remove(a):
    for i in range(len(a)):
        if a[i] % 2 != 0:
            a[i] = 0
    return a

a = [5, 10, 15, 20, 22, 23]
print(remove(a))