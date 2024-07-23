# def is_palindrome(num):
#     # Convert number to string for easy comparison
#     num_str = str(num)
#     # Reverse the string
#     reversed_str = num_str[::-1]
#     # Check if the original number is equal to its reverse
#     if num_str == reversed_str:
#         return True
#     else:
#         return False

# # Input number from the user
# num = int(input("Enter a number: "))

# # Check if the number is a palindrome
# if is_palindrome(num):
#     print(f"{num} is a palindrome.")
# else:
#     print(f"{num} is not a palindrome.")

def is_palindrome(num):
    original_num = num
    reverse_num = 0

    while num > 0:
        last_digit = num % 10
        reverse_num = reverse_num * 10 + last_digit
        num = num // 10
    print ("The Palindrome no. is: ", reverse_num)
    if original_num == reverse_num:
        return True
    else:
        return False

# Test the function
num = int(input("Enter a number: "))

if is_palindrome(num):
    print(f"{num} is a palindrome.")
else:
    print(f"{num} is not a palindrome.")
