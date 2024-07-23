cricketer = ["Virat", "Dhoni", "Rohit", "Hardik", "Yuvraj"]
print("\n\n") 

print("Original list:\n", cricketer)

print("\n\n") 

# 1. Indexing: Accessing a specific element in the list
print("Output 1: \n", cricketer[0])  # Output 1: Virat
# Purpose: Get the first element of the list

print()

# 2. Slicing: Getting a subset of elements from the list
print("Output 2: \n", cricketer[1:3])  # Output 2: ['Dhoni', 'Rohit']
# Purpose: Get a slice of elements from the list

print()

# 3. Append: Adding a new element to the end of the list
cricketer.append("Sachin")
print("Output 3: \n", cricketer)  # Output 3: ['Virat', 'Dhoni', 'Rohit', 'Hardik', 'Yuvraj', 'Sachin']
# Purpose: Add a new element to the end of the list

print()

# 4. Insert: Inserting a new element at a specific position in the list
cricketer.insert(2, "Kohli")
print("Output 4: \n", cricketer)  # Output 4: ['Virat', 'Dhoni', 'Kohli', 'Rohit', 'Hardik', 'Yuvraj', 'Sachin']
# Purpose: Insert a new element at a specific position in the list

print()

# 5. Remove: Removing the first occurrence of an element in the list
cricketer.remove("Hardik")
print("Output 5: \n", cricketer)  # Output 5: ['Virat', 'Dhoni', 'Kohli', 'Rohit', 'Yuvraj', 'Sachin']
# Purpose: Remove the first occurrence of an element in the list

print()

# 6. Pop: Removing an element at a specific position in the list
cricketer.pop(2)
print("Output 6: \n", cricketer)  # Output 6: ['Virat', 'Dhoni', 'Rohit', 'Yuvraj', 'Sachin']
# Purpose: Remove an element at a specific position in the list

print()

# 7. Extend: Adding multiple elements to the end of the list
cricketer.extend(["Raina", "Jadeja"])
print("Output 7: \n", cricketer)  # Output 7: ['Virat', 'Dhoni', 'Rohit', 'Yuvraj', 'Sachin', 'Raina', 'Jadeja']
# Purpose: Add multiple elements to the end of the list

print()

# 8. Sort: Sorting the list in ascending order
cricketer.sort()
print("Output 8: \n", cricketer)  # Output 8: ['Dhoni', 'Jadeja', 'Raina', 'Rohit', 'Sachin', 'Virat', 'Yuvraj']
# Purpose: Sort the list in ascending order

print()

# 9. Reverse: Reversing the order of the list
cricketer.reverse()
print("Output 9: \n", cricketer)  # Output 9: ['Yuvraj', 'Virat', 'Sachin', 'Rohit', 'Raina', 'Jadeja', 'Dhoni']
# Purpose: Reverse the order of the list

print()

# 10. Index: Finding the index of an element in the list
print("Output 10:", cricketer.index("Rohit"))  # Output 10: 3
# Purpose: Find the index of an element in the list

print()

# 11. Count: Counting the occurrences of an element in the list
print("Output 11:", cricketer.count("Rohit"))  # Output 11: 1
# Purpose: Count the occurrences of an element in the list

print()

# 12. Len: Getting the length of the list
print("Output 12:", len(cricketer))  # Output 12: 7
# Purpose: Get the length of the list

print()

# 13. Copy: Creating a copy of the list
new_cricketer = cricketer.copy()
print("Output 13: \n", new_cricketer)  # Output 13: ['Yuvraj', 'Virat', 'Sachin', 'Rohit', 'Raina', 'Jadeja', 'Dhoni']
#Purpose: Create a copy of the list

print()

# 14. Clear: Clearing the list
cricketer.clear()
print("Output 14:", cricketer)  # Output 14: []
# Purpose: Clear the list

print()

# 15. List comprehension: Creating a new list based on an existing list
numbers = [1, 2, 3, 4, 5]
squared_numbers = [x**2 for x in numbers]
print("Output 15:", squared_numbers)  # Output 15: [1, 4, 9, 16, 25]
# Purpose: Create a new list based on an existing list

print()

# 16. Nested lists: Creating a list of lists
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print("Output 16: \n", matrix)  # Output 16: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# Purpose: Create a list of lists

print()

# 17. List unpacking: Assigning elements of a list to multiple variables
a, b, c = [1, 2, 3]
print("Output 17:", a, b, c)  # Output 17: 1 2 3
# Purpose: Assign elements of a list to multiple variables

print()

# 18. List as stack: Using a list as a stack (Last In, First Out)
stack = []
stack.append(1)
stack.append(2)
stack.append(3)
print("Output 18: \n", stack.pop())  # Output 18: 3
print("Output: \n", stack.pop())  # Output 19: 2
print("Output: \n", stack.pop())  # Output 20: 1
# Purpose: Use a list as a stack

print()

# 19. List as queue: Using a list as a queue (First In, First Out)

from collections import deque
queue = deque([])  # Create an empty deque
queue.append(1)  # Add element 1 to the end of the queue
queue.append(2)  # Add element 2 to the end of the queue
queue.append(3)  # Add element 3 to the end of the queue

print("Output 19: \n", queue.popleft())  # Remove and return the first element (1)
print("Output: \n", queue.popleft())  # Remove and return the next element (2)
print("Output: \n", queue.popleft())  # Remove and return the last element (3)


# Purpose: Use a list as a queue

print()

# 20. List as set: Removing duplicates from a list by converting it to a set
numbers = [1, 2, 3, 1, 2, 3]
unique_numbers = list(set(numbers))
print("Output 20:", unique_numbers)  # Output 24: [1, 2, 3]
# Purpose: Remove duplicates from a list

print()

# 21. List as dictionary: Creating a dictionary from two lists
keys = ['a', 'b', 'c']
values = [1, 2, 3]
dictionary = dict(zip(keys, values))
print("Output 21:", dictionary)  # Output 25: {'a': 1, 'b': 2, 'c': 3}
# Purpose: Create a dictionary from two lists

print()

# 22. List as string: Joining elements of a list into a string
words = ['Hello', 'World']
sentence = ' '.join(words)
print("Output 22:", sentence)  # Output 26: Hello World
# Purpose: Join elements of a list into a string

print()

# 23. List as string: Splitting a string into a list of words
sentence = 'Hello World'
words = sentence.split()
print("Output 23:", words)  # Output 27: ['Hello', 'World']
# Purpose: Split a string into a list of words

print()

