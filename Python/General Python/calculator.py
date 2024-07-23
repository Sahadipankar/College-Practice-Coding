print("********Menu********")
print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exponentiation")
print("********************")
ch = int(input("Enter your choice from 1 to 6: "))
a = int(input("Enter a number: "))
b = int(input("Enter another number: "))
if ch == 1:
    print("The sum of the two numbers is", a+b)
elif ch == 2:
    print("The difference of the two numbers is", a-b)
elif ch == 3:
    print("The product of the two numbers is", a*b)
elif ch == 4:
    print("The quotient of the two numbers is", a/b)
elif ch == 5:
    print("The remainder of the two numbers is", a%b)
elif ch == 6:
    print("The result of a to the power b is", a**b)
else:
    print("Invalid choice. Thank you for using. This Calculator is created by Dipankar Saha")
