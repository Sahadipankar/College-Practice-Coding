# #How to create a list
# fruits = ["apples", "banana", "pineapple"]
# print(fruits)

# print(fruits[0])
# print(fruits[1])
# print(fruits[2])

# student = ["Raj", "Sec - M", 20, 3.14]
# print(student)

# empty_list = []
# print(empty_list)

# print(len(fruits))
# print(len(student))

# fruits.insert(1, "guava")
# print(fruits)

# student1 = ["Raj", "Mustaq", "Jasmine", "Shombhu"]
# print(student1)
# student1[1] = "Priya" #Reassignment
# print(student1)
# student1.append("Rahul") #Adding element at the end
# print(student1)

# print(student1[0:3])
# print(student1[1:4]) #Slicing
# print(student1[1::3]) 

#Data refers to the facts and statistics collected together for reference or analysis. It can be in the form of numbers, words, images, sounds, or videos, and is used to derive insights, make decisions, or solve problems.

#Programming languages: C, C++, Java, c# -> Compilable language

#Script language conept: Python, R, etc..

#String: Collection of different characters that might contain alphabets and other numerical values.

#String are generally represented in double quoutes or single quotes. Ex - str = "abc"

#Concatenation of strings: Two or more strings can be concatenated using the '+' operator.

# str1 = "hello"
# str2 = "world"
# print(str1 + " " + str2)

#Comments
#Single line comment
#Multi line comment

#Array representation of string - 
#Array: The consecutive memore elements of single type. 

# str3 = "Welcome to Data Visualisation" 
# print(str3[5])
# for i in str3:
#     print(i)

# #Negative Indexing
# print(str3[-5:-2])

# import numpy as np
# x = np.array([1,2,3,4])
# print(x)

# y = ([1, 2, 3, 4])
# print(y)

#Shape in Numpy: Shape of an array is the no. of elements in each dimension. Numpy arrays have an attribute named shape that returns a tuple

# var = np.array([1, 2, 3, 4, 5, 6, 7, 8])
# print(var)
# print("\n", var.shape)
# print()

# var1 = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [1, 2, 3, 4]])
# print(var1)
# print("\n", var1.shape)

#Reshape - Changing the shape of an array

arr = np.array([1, 2, 3, 4, 5, 6, 7, 8])
print(arr)
print("\n", arr.shape)
print()

arr1 = arr.reshape(2, 4)
print(arr1)
print("\n", arr1.shape)

arr2 = arr1.reshape(8)
print(arr2)