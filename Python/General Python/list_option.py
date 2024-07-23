list = []
while True:
    print ("1. for inserting an element:")
    print ("2. for deleting an element:")
    print ("3. for displaying the list:")

    ch = int(input("Enter your choice: "))
    if ch == 1:
        a = int(input("Enter an Item: "))
        list.append(a)
        b = int(input("Enter an Item: "))
        list.append(b) # append() is used to add an element at the end of the list
        c = int(input("Enter an Item: "))
        list.append(c)
        d = int(input("Enter an Item: "))
        list.append(d)
        e = int(input("Enter an Item: "))
        list.append(e)
    elif ch == 2:
        a = int(input("Enter an Item to delete: "))
        list.remove(a)
    elif ch == 3:
        print(list)
    else:
        break