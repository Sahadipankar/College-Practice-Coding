n = int(input("Enter a number to check Prime or not: "))
prime = 0
if  n > 0:
    for i in range(2,n):
        if n % i == 0:
            prime = 1
            break
    if prime == 1:
        print (f"{n} is not a Prime Number")
    else:
        print (f"{n} is a Prime Number")
else : print ("Number must be greater than zero")