list = []
while True:
    print ("1. to insert.")
    print ("2. to delete.")
    print ("3. to display.")
    ch = int(input("Enter your choice: "))
    if ch == 1:
        item = int(input("Enter the element to be inserted: "))
        list.append(item)
    elif ch == 2:
        item = int(input("Enter the element to be deleted: "))
        if list == []:
            print ("List is empty")
        else:
            list.remove(item) # remove() is used to remove the first occurrence of the element
    elif ch == 3:
        print (list)
    else:
        print("Invalid choice")
        break