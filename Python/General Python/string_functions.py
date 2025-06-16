s = "I am a boy and my name is Raj."

print()
print("\nThe given string is:", s)

print("\n\n1. The length of the string is:", len(s))  # Returns the length of the string
print()

print("2. Upper Case:", s.upper())  # Converts the string to uppercase
print()

print("3. Lower Case:", s.lower())  # Converts the string to lowercase
print()

print("4. Count of letter 'a':", s.count("a"))  # Returns the count of a specific character in the string
print()

print("5. Starts with 'I':", s.startswith("I"))  # Checks if the string starts with a specific character or phrase
print()

print("6. Ends with 'Raj.':", s.endswith("Raj."))  # Checks if the string ends with a specific character or phrase
print()

b = s.replace("Raj", "Rajesh")
print("7. Replace 'Raj' with 'Rajesh':", b)  # Replaces a specific character or phrase with another
print()

print("8. Find index of 'boy' in the string:", s.find("boy"))  # Returns the index of the first occurrence of a specific character or phrase
print()

print("9. Index of 'boy' in the string (raises ValueError if not found):", s.index("boy"))  # Returns the index of the first occurrence of a specific character or phrase, raises ValueError if not found
print()

print("10. Split the string into a list of words:", s.split())  # Splits the string into a list of words
print()

print("11. Join the list of words into a string:", " ".join(s.split()))  # Joins a list of words into a string
print()

print("12. Strip leading and trailing whitespaces:", s.strip())  # Removes leading and trailing whitespaces
print()

print("13. Lstrip (remove leading whitespaces):", s.lstrip())  # Removes leading whitespaces
print()

print("14. Rstrip (remove trailing whitespaces):", s.rstrip())  # Removes trailing whitespaces
print()

print("15. Partition the string into three parts:", s.partition("boy"))  # Splits the string into three parts: before the separator, the separator, and after the separator
print()

print("16. Rpartition the string into three parts:", s.rpartition("boy"))  # Splits the string into three parts: before the separator, the separator, and after the separator, starting from the end
print()

print("17. Split the string into a list of words (maxsplit=2):", s.split(" ", 2))  # Splits the string into a list of words, with a maximum of 2 splits
print()

print("18. Center the string with * (width=20):", s.center(20, "*"))  # Centers the string with a specific character, with a specified width
print()

print("19. Ljust (left-justify) the string (width=20):", s.ljust(20))  # Left-justifies the string, with a specified width
print()

print("20. Rjust (right-justify) the string (width=20):", s.rjust(20))  # Right-justifies the string, with a specified width
print()

print("21. Zfill (zero-fill) the string (width=20):", s.zfill(20))  # Zero-fills the string, with a specified width
print()

print("22. Swapcase (swap uppercase and lowercase):", s.swapcase())  # Swaps uppercase and lowercase characters
print()

print("23. Titlecase (convert to title case):", s.title())  # Converts the string to title case
print()

print("24. Casefold (convert to casefold):", s.casefold())  # Converts the string to casefold
print()

print("25. Encode the string:", s.encode())  # Encodes the string to bytes
print()

print("26. Format the string:", s.format())  # Formats the string using format specifiers
print()

print("27. Reverse the string:", s[::-1])  # Reverses the string
print()