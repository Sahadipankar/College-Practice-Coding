salary = float(input("Enter the Basic Salary: "))
if salary < 10000 :
    hra = 20 * salary / 100
    da = 80 * salary / 100
elif salary <= 20000 :
    hra = 25 * salary / 100
    da = 90 * salary / 100
elif salary > 20000 :
    hra = 30 * salary / 100
    da = 95 * salary / 100
gross_salary = salary + hra + da
print ("\nThe Gross Salary is: ",gross_salary)