import numpy as np
from scipy import stats

# Create a list
list1 = [10, 20, 30, 40, 50, 50]

# Convert the list to a NumPy array
array1 = np.array(list1)

# Print the array
print("Array: ", array1)

# Calculate the mean of the array
mean = np.mean(array1)

# Print the mean
print("Mean: ", mean)

# Calculate the median of the array
median = np.median(array1)
print("Median is", median)

# Calculate the mode of the array
mode = stats.mode(array1)
print("Mode is", mode.mode)  # Fix: access the mode value correctly

# Calculate the standard deviation of the array
std_dev = np.std(array1)

# Print the standard deviation
print("Standard Deviation: ", std_dev)