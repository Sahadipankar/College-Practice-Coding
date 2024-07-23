while True:
    c=int(input("Enter a Number: "))
    a = c
    if c>0:
        f=1
        while c>0:
            f=f*c
            c-=1
        print("The factorial of", a, "is", f)
    else:
        print("Please enter a positive number.")
        break