a = int(input("Enter a Number: "))
i = 1
fact = 1
while i <= a:
    fact *= i
    i += 1
print (f"\nThe factorial of {a} is {fact}")