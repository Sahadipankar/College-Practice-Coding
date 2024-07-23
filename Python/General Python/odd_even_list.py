list = [4, 7, 42, 33, 56, 96, 33, 55, 64]
print (list)
print ()
even = []
odd = []
for i in list:
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)
print ("List of Even Numbers:", even)
print ("List of Odd Numbers:", odd)