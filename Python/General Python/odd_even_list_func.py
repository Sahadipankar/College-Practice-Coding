# Program to create two lists, one containing even numbers and other containing odd numbers from a list of numbers using function. 

def odd_even_list(list):
    even = []
    odd = []
    for i in list:
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)
    return even, odd

n = int(input("\nEnter the Size of list: "))
print ()
list = []
for i in range(n):
    list.append(int(input("Enter the Element: ")))
print ()
print (list)
print ()
even, odd = odd_even_list(list)
print ("List of Even Numbers:", even)
print ("List of Odd Numbers:", odd)
