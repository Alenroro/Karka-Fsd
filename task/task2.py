
start = 10
end = 55

evennum = 0
oddnum = 0

for i in range(start, end + 1):

    if i % 2 == 0:
        evennum += 1
    else:
        oddnum += 1

print("Even Numbers:", evennum)
print("Odd Numbers:", oddnum)