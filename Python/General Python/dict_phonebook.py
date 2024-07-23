phonebook = {}
while True:
    print ("\n1. Add a Contact")
    print ("2. To Update a Contact")
    print ("3. To Delete a Contact")
    print ("4. To search for a Contact in the Inventory")
    print ("5. To sort the key of the Contact List")
    print ("6. To Display all the Contacts in the Phonebook")
    print ("7. To Exit")

    ch = int(input("\nEnter your choice: "))
    if ch == 1:
        contact = input("\nEnter the Contact Name: ")
        number = int(input("Enter the Contact Number: "))
        phonebook[contact] = number
    elif ch == 2:
        contact = input("\nEnter the Contact Name to be updated: ")
        number = int(input("Enter the new Contact Number: "))
        if contact in phonebook:
            phonebook[contact] = number
        else:
            print ("Contact not found")
    elif ch == 3:
        contact = input("\nEnter the Contact Name to be deleted: ")
        if contact in phonebook:
            del phonebook[contact]
        else:
            print ("Contact not found")
    elif ch == 4:
        contact = input("\nEnter the Contact Name to be searched: ")
        print ()
        if contact in phonebook:
            print(f"Contact {contact} found with contact number {phonebook[contact]}") 
        else:
            print ("Contact not found")
    elif ch == 5:
        print ("\nSorted Contact List: ")
        for key in sorted(phonebook):
            print (f"{key}: {phonebook[key]}")
    elif ch == 6:
        print ("\nContact List: ")
        for key in phonebook:
            print (f"{key}: {phonebook[key]}")
    elif ch == 7:
        break
    else:
        print ("\nInvalid choice")