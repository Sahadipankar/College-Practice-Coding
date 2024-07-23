import pandas as pd

std_data = [(1, "Varun", 30, "Male", "Delhi"),
            (2, "Raj", 27, "Male", "Kolkata"),
            (3, "Riya", 25, "Female", "USA"),
            (4, "Priya", 24, "Female", "Japan"),
            (5, "Sam", 30, "Male", "Mumbai")]

data = pd.DataFrame(std_data, columns=("Std_id", "Name", "Age", "Gender", "Place"))

# 1. Print the entire DataFrame
print("\n1. DataFrame:\n")
print(data)

# 2. Print the top 2 rows of the DataFrame
print("\n2. Top 2 rows:\n")
print(data.head(2))  # head() function returns the first n rows of the DataFrame

# 3. Print the bottom 2 rows of the DataFrame
print("\n3. Bottom 2 rows:\n")
print(data.tail(2))  # tail() function returns the last n rows of the DataFrame

# 4. Print a summary of the data (mean, std, min, 25%, 50%, 75%, max)
print("\n4. Summary of the data:\n")
print(data.describe())  # describe() function generates descriptive statistics

# 5. Print information about the data (index dtype and column dtypes, non-nullable counts, memory usage)
print("\n5. Information about the data:\n")
print(data.info())  # info() function prints a concise summary of the DataFrame

# 6. Print the shape of the data (number of rows, number of columns)
print("\n6. Shape of the data:", data.shape)  # shape attribute returns a tuple representing the dimensionality of the DataFrame

# 7. Print the columns of the data
print("\n7. Columns of the data:\n")
print(data.columns)  # columns attribute returns an Index object representing the column labels

# 8. Print the total number of elements in the data
print("\n8. Total number of elements in the data:", data.size)  # size attribute returns the total number of elements in the DataFrame

# 9. Print the index of the data
print("\n9. Index of the data:", data.index)  # index attribute returns the index (row labels) of the DataFrame

# 10. Print the data types of the columns
print("\n10. Data types of the columns:\n")
print(data.dtypes)  # dtypes attribute returns the data type of each column

# 11. Print the values of the data
print("\n11. Values of the data:\n")
print(data.values)  # values attribute returns a NumPy representation of the DataFrame

# 12. Print only the "Name" column
print("\n12. Only Name column:\n")
print(data["Name"])  # selecting a single column by label