lb = int(input("Enter the starting number: "))#Lower Bound
ub = int(input("Enter the ending number: "))#Upper Bound
s = 0
print(f"The sum of prime number from {lb} to {ub} is: ")
while lb <= ub:
    i = 2
    f = 0
    while i < lb:
        if lb % i == 0:
            f += i
            break
        i += 1
    if f == 0:
        s += lb
        print(lb,end=" ")
    lb += 1
print ("\nSum is: ", s)