item = {}
while True:
    print ("\n1. Add an item")
    print ("2. To Update an item")
    print ("3. To Delete an item")
    print ("4. To Display List of Items in the Inventory")
    print ("5. To print lentgh of the dictionary")
    print ("6. To search for an Item in the Inventory")
    print ("7. To sort the key of the Inventory")
    print ("8. To Exit")

    ch = int(input("\nEnter your choice: "))
    if ch == 1:
        item_name = input("\nEnter the item name: ")
        price = int(input("Enter the price: "))
        item[item_name] = price
    elif ch == 2:
        item_name = input("\nEnter the item name: ")
        if item_name in item.keys(): #check if item is present in the dictionary
            price = int(input("Enter the price: "))
            item[item_name] = price
        else:
            print ("\nItem not found")
    elif ch == 3:
        item_name = input("\nEnter the item name: ")
        if item_name in item:
            del item[item_name]
        else:
            print ("\nItem not found")
    elif ch == 4:
        print ("\nList of Items in the Inventory\n")
        print (item) #print dictionary
        print ()
        print (item.keys()) #print keys
        print ()
        print (item.values()) #print values
        print ()
        print (item.items()) #print key value pair
    elif ch == 5:
        print (len(item))
    elif ch == 6:
        item_name = input("\nEnter the item name: ")
        print ()
        if item_name in item:
            print (f"{item_name} found at price {item[item_name]}")
        else:
            print ("\nItem not found")
    elif ch == 7:
        print ()
        for item in sorted(item.keys()): #sort the keys
            print (item)
    elif ch == 8:
        break
    else:
        print ("\nInvalid choice")