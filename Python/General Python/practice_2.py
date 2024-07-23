# # File I/O

# with open(r"D:\Downloads\Building Letter.txt", "r") as f:
#     data = f.read()
#     print(data)
#     print(type(data))
#     print(len(data))

# word = input("Enter the word to be checked: ")
# def check_for_word():
#     with open (r"D:\Downloads\Building Letter.txt", "r") as f:
#         data = f.read()
#         if word in data:
#             print(f"{word} is present in the file")
#         else:
#             print(f"{word} is not present in the file")

# check_for_word()

# def check_for_line():
#     data = True
#     line_no = 1
#     with open (r"D:\Downloads\Building Letter.txt", "r") as f:
#         while data:
#             data = f.readline()
#             if word in data:
#                 print(f"{word} is present in the file in line number {line_no}")
#                 return
#             line_no += 1
#         else:
#             print(f"{word} is not present in the file")

# check_for_line()

# # import os #To Delete a file

# # os.remove(r"D:\Downloads\Building Letter.txt")
# # print("File Deleted")
# # os.rename(r"D:\Downloads\Building Letter.txt", r"D:\Downloads\haga.txt")
# # print("File Renamed")

# # Creating a file, replacing items

# # with open("practice.txt", "w") as f:
# #     f.write("Hi everyone\nWe are learning File I/O\n")
# #     f.write("using Java\n")
# #     f.write("I like programming in Java")

# # with open(r"practice.txt", "r") as f:
# #     data = f.read()
# #     new_data = data.replace("Java", "Python")
# #     print(new_data)
# # with open(r"practice.txt", "w") as f:
# #     f.write(new_data)
# #     print("File updated")

# with open(r"practice.txt", "w") as f:
#     f.write("1, 2, 3, 4, 5, 6, 7, 8")

# with open("practice.txt", "r") as f:
#     data = f.read()
# print(data)
# print(type(data))

# def count_odd_even():
#     count = 0
#     nums = data.split(",")

#     for val in nums:
#         if (int(val) % 2 == 0):
#             count += 1
#     print(f"Number of even numbers in the list is: {count}")

# count_odd_even()
# # with open("practice.txt", "a") as f:
# #     f.write(", 9, 10, 11, 12, 13, 14, 15, 16")
# #     print("Data appended")

# OOP

# class Student:

#     college_name = "Brainware University"   #Class Attribute

#     def __init__(self, name, marks):

#         self.name = name        #Object Attribute
#         self.marks = marks
        
#     def welcome(self):
#         print("Welcome student,", self.name)
    
#     def get_marks(self):
#         return self.marks

# #creating class #creating object
# s1 = Student("Raj", 97)
# s1.welcome()
# print(s1.college_name, s1.get_marks())

#Create student class that takes name & marks of 3 subjects as arguments in constructor.Then create a method to print the average.

# class Student:
        
#         def __init__(self, name, marks):
             
#             self.name = name
#             self.marks = marks
        
#         def average(self):
              
#             marks = 0
#             for val in self.marks:
#                 marks += val
#                 avg = marks / 3
#             print(f"Hi {s1.name}, you average marks is {avg}")
        
#         @staticmethod       #Static Method to make this method Class Level
#         def hello():
#             print("Hello")

# s1 = Student("Raj", [99, 97, 98])
# s1.average()
# s1.hello()     

#Create Account class with 2 attributes - balance & account no. Create methods for debit, credit & printing the balance.

# class Account:

#     def __init__(self, balance, account_no):

#         self.balance = balance
#         self.account_no = account_no
    
#     #Debit Method

#     def debit(self, amount):
#         self.balance -= amount
#         print(f"\nAmount debited: {amount}")
#         print(f"Current account balance is {acc1.get_balance()} for Acc No: {acc1.account_no}")

#     #Credit Method

#     def credit(self, amount):
#         self.balance += amount
#         print(f"\nAmount credited: {amount}")
#         print(f"Current account balance is {acc1.get_balance()} for Acc No: {acc1.account_no}")

#     #Get Balance Method

#     def get_balance(self):
#         return self.balance

# acc1 = Account(10000, 12345)
# print(f"\nStarting acount balance is {acc1.balance} for Acc No: {acc1.account_no}")

# acc1.debit(5000)
# acc1.credit(10000)
# acc1.credit(30000)
