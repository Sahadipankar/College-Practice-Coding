list1 = ['Raj', 'Rahul', 10.5, 'Sreya', 45, 'Riya', 110]
print ()
print (list1)
print ()
n = eval(input("Enter the element to be searched in the list: "))
print ()
if n in list1:
    print ("The element is present in the list at index: ", list1.index(n))
else:  
    print ("The element is not present in the list.")
print ()