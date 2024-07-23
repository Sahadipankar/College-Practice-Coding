rows = int(input("Enter the number of rows: "))
for i in range (1, rows + 1):
    a = 65
    for j in range (1, i + 1):
        print(chr(a), end = " ")
        a += 1
    print()