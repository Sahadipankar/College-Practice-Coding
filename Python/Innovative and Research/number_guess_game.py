import random

def number_guessing_game():
    # Set the range for the random number
    lower_bound = 1
    upper_bound = 100
    
    # Generate a random number within the specified range
    target_number = random.randint(lower_bound, upper_bound)
    
    print(f"Welcome to the Number Guessing Game!")
    print(f"I'm thinking of a number between {lower_bound} and {upper_bound}.")
    
    # Initialize the number of guesses taken
    number_of_guesses = 0
    
    # Infinite loop to keep the game running until the correct guess
    while True:
        # Prompt the player to enter a guess
        guess = int(input("Enter your guess: "))
        
        # Increment the guess counter
        number_of_guesses += 1
        
        # Check if the guess is correct
        if guess == target_number:
            print(f"Congratulations! You guessed the correct number in {number_of_guesses} tries.")
            break
        elif guess < target_number:
            print("Too low! Try again.")
        else:
            print("Too high! Try again.")

    # End of the game message
    print("Thank you for playing the Number Guessing Game!")

# Call the game function to start the game
number_guessing_game()
