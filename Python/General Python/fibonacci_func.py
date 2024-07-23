def fibo(n):
    first_term = 0
    second_term = 1
    next_number = first_term
    count = 1
    while count <= n:
        print(next_number, end=" ")
        count += 1
        first_term, second_term = second_term, next_number
        next_number = first_term + second_term
    print()

n = int(input("Enter the number of Terms: "))
fibo(n)