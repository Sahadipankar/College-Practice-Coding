first_term = 0
second_term = 1
n = int(input("Enter the number of Terms: "))
if n == 0 : print (first_term)
else : 
    print ("The fibonacci series is: \n",end="")
    print(first_term,second_term,end=" ")
for i in range(2, n):
    third_term = first_term +  second_term
    first_term = second_term
    second_term = third_term
    print(third_term, end=" ")

