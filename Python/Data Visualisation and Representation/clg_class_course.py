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

# arr = np.array([1, 2, 3, 4, 5, 6, 7, 8])
# print(arr)
# print("\n", arr.shape)
# print()

# arr1 = arr.reshape(2, 4)
# print(arr1)
# print("\n", arr1.shape)

# arr2 = arr1.reshape(8)
# print(arr2)



# # Data Visualisation and Representation
# # Starting Panda Programming

# # Panda is a python module that makes data analysis more easy and effective
# # Data Analytics-is a process of analyzing large set of datas to get answers on questions related to that data .


# import pandas as pd
# data = pd.read_csv(r"D:\Downloads\Book1.csv")
# print()
# print(data)
# print()
# print(data["Name"])
# print()
# print(data["Total Marks"].max())
# print()
# print(data["Total Marks"].min())
# print()
# print(data.head(5))
# print()
# print(data.tail(5))
# print()
# print(data[4:9])
# print()
#data["Total Marks"].mean()
# print()
#data["Total Marks"].median()


# import pandas as pd
# data = {
#      "cars" : ["BMW" ,"Maruti" ,"TVS", "Honda" ],

#       "milage" : [120, 200, 120, 300]
#         }
# df = pd.DataFrame(data)
# print(df)
# print(df["milage"].mean())
# print(df["milage"].median())
# print(df["milage"].mode()[0])
# print(df["milage"].std())
# print(df["milage"].max())
# print(df["milage"].min())
# print(df["milage"].sum())
# print(df["milage"].count())


# import pandas as pd
# data = {
#     "presuure" : {
#         "john" : 120,
#         "Raman" : 150,
#         "Karim" : 180
#     },
#     "sugar" : {
#         "john" : 110,
#         "Raman" : 160,
#         "Karim" : 170
#     }
# }
# df = pd.DataFrame(data)
# print (df)
# print (data)


# from google.colab import drive
# drive.mount('/content/drive')


# # Data handling in python and pandas library :- 
# # Data is the raw facts . Data is required to be stored in some storage so that we can use it for any purpose in any later time properly.
# # Some storage  of data are MS Excel file ,  MS Access or any data base like sql table etc. 
# # .csv file  comma separated values .This file contains the comma separated values and is obtained from the excel file. 

# # Steps :- 
# # 1)	Create a variable which contains some data  that may be dictionary also.
# # 2)	Convert the vari
# # Steps :- 
# # 1)	Create a variable which contains some data  that may be dictionary also.
# # 2)	Convert the variable into dataframe (Dataframe is the frame containing data in some tabular fomat )

# # Read_csv() is  used to access the csv file 
# # head() shows 5 rows from the top  by default. 

# # Some column of the table can be chosen and statistical functions can  be evaluated on them.
# # Need of  data storage :- 
# # For analysis of data and for making a visualisation of the data so that we can derive and infer some results form it. 
# # Mathematical analysis of data, statistical analysis of data and finally the representation of data in graphs . 

# # Simple pandas program 
# # Create  a dictionary (Key value pairs eg name(key)  John (value))
# # Convert the dictionary into dataframe.
# # Dataframe is the  tabular  representation of  data  in terms of rows and columns.
