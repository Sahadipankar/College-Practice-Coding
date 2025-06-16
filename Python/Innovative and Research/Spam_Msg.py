# Import the required modules
import pyautogui  # Provides GUI automation functions
import time       # Used to add delays between actions

# Notify the user to switch to the target window
print("\nSwitch to the target window. The script will start typing in 5 seconds...\n")

# Wait for 5 seconds to give the user time to switch to the desired window
time.sleep(5)

# Start a loop to send the message 5 times
for count in range(10):  # Loop runs 5 times (0 to 4)
    # Type the message "  " at the current cursor position
    pyautogui.typewrite("sepnu pues") # Message to be sent
    
    # Simulate pressing the "Enter" key to send the message
    pyautogui.press("enter")
    
    # Provide feedback in the console for each message sent
    print(f"Message {count + 1} sent!")
    
    # Add a short delay of 0.5 seconds between each message for smooth execution
    time.sleep(0.5)

# Notify the user that the script has completed its task
print("\nScript completed successfully!")
