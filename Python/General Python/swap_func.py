def swap(a,b):
    temp = a
    a = b
    b = temp
    return a, b

n = int(input("Enter the first number: "))
m = int(input("Enter the second number: "))
print("Before Swapping: n =", n, "m =", m)
n, m = swap(n, m)
print("After Swapping: n =", n, "m =", m)