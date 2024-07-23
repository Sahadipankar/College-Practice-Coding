'''char = "A"
print (ord(char))  # Output: 65     #To print ASCII Value
int = 65
print (chr(int))  # Output: A       #To print ASCII Representation

#logical operator

exp1 = 2 > 1    #True
exp2 = 10 < 5   #False
print ("\nExpression1 and Expression 2 is: ",exp1 and exp2)   #AND
print ("Expression1 or Expression 2 is: ",exp1 or exp2)     #OR
print ("Not Expression is: ",not(exp1))                     #NOT

#Identity Operator

x = 5
y = 5
print("\nX is Y: ", x is y)
print("X is not Y: ", x is not y)

#Membership Operator

fruits = ["Apple", "Banana", "Grapes"]
print("\nIf Banana is present in Fruits:", "Banana" in fruits)
print("If Mango is not present in Fruits:", "Mango" not in fruits)

#Bitwise Operator

a = 5
b = 3
print("\nBitwise AND of a & b:", a & b)
print("Bitwise OR of a | b:", a | b)
print("Bitwise XOR of a ^ b:", a ^ b)

a = 4; b = 6; print (a+b)

#String funtions

str = "i am a boy"
print("\nMy name is:",str)
print(str.endswith("ga"))
print(str.capitalize())
print(str.replace("am","kill"))
print(str.find("am"))
print(str.count("a"))
print(len(str))

a = input("Enter text 1:")
b = input("Enter text 2:")
c = input("Enter text 3:")
list = [a, b, c]
print(list)

list1 = [1, 2, 3, 2, 4]
list2 = list1.copy()
list2.reverse()
print(list1)
print(list2)
if (list1 == list2):
    print("\nIs Palindrome")
else:
    print("\nNot Palindrome")

tuple = (1, "abc", 2)
print(type(tuple))
print(tuple)

dict = {
    "Cat" : "A small Animal", 
    "Table" : ["A piece of furniture", "List of facts and figures"]
}
print(dict)

def cacl_sum(a, b):
    sum = a + b
    print(sum)
cacl_sum(10, 20)
cacl_sum(20, 30)

def print_len(a):
    print(len(a))
print_len("Hello")

def print_fact(a):
    fact = 1
    for i in range(1, a+1):
        fact = fact * i
    print(fact)
print_fact(5)

def print_list (list1):
    for i in list1:
        print(i, end=" ")
list1 = [411, 55, "Raj", 85.56]
print_list(list1)

def calc_fact(n):
    fact = 1
    for i in range (1, n+1):
        fact *= i
    print(f"The factorial of {n} is: {fact}")

n = int(input("Enter the number to print factorial: "))
calc_fact(n)

def converter (usd):
    inr = usd * 83.61
    print(f"{usd}$ = {inr}₹")

converter(50)

def odd_even(n):
    if n % 2 == 0:
        print(f"{n} is Even")
    else:
        print(f"{n} is Odd")

odd_even(int(input("Enter a number to find odd or even: ")))

def calc_fact(n):
    if (n == 1):
        return 1
    else:
        return calc_fact(n-1) * n

n = int(input("Enter the number to print factorial: "))
fact = calc_fact(n)
print(f"The factorial of {n} is: {fact}")

def cal_sum(n):
    if n == 1:
        return 1
    else:
        return n + cal_sum(n-1)

n = int(input("Enter the value of n: "))
sum = cal_sum(n)
print(f"The sum of first {n} number is: {sum}")

def print_list(list, idx):
    if (idx == len(list)):
        return
    print(list[idx], end=" ")
    print_list(list, idx+1)

n = int(input("Enter the number of items in list: "))
list1 = []
for i in range (n):
    list1.append(int(input(f"Enter the list item {i}: ")))
print_list(list1, 0)'''
