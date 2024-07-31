from random import randint
import time


# User input for the password
user_pass = input("\nEnter your Password: ")

# Available characters to guess from
password = [
    "A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g",
    "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n",
    "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u",
    "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z",
    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
    "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+",
    "[", "]", "{", "}", "\\", "|", ";", ":", "'", "\"", ",", ".", "<", ">",
    "/", "?", "~", "`"
]

# Start timer
start_time = time.time()

guess = ""
attempts = 0

# Loop until the guessed password matches the user input
while guess != user_pass:
    guess = ""
    for letter in range(len(user_pass)):
        guess_letter = password[randint(0, len(password) - 1)]
        attempts += 1
        guess += guess_letter
        # print(guess)

# End timer
end_time = time.time()

print(f"Password cracked: {guess}")
print(f"Number of attempts: {attempts}")
print(f"Time taken: {end_time - start_time:.2f} seconds")


# import random
# import string
# import time

# # Define the character set including letters, digits, and special characters
# charset = string.ascii_letters + string.digits + string.punctuation

# # Function to randomly generate a password of the same length as the user's password
# def generate_random_password(length):
#     return ''.join(random.choice(charset) for _ in range(length))

# # User-defined password to guess
# user_password = input("\nEnter the password to crack: ")

# # Start timer
# start_time = time.time()

# # Brute-force attempt
# guess = ""
# attempts = 0
# while guess != user_password:
#     guess = generate_random_password(len(user_password))
#     attempts += 1
#     # Optionally, print attempts (uncomment to see attempts)
#     # print(f"Attempt {attempts}: {guess}")

# # End timer
# end_time = time.time()

# print(f"Password cracked: {guess}")
# print(f"Number of attempts: {attempts}")
# print(f"Time taken: {end_time - start_time:.2f} seconds")

