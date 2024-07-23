def conversion(temp, unit):
    if unit == "C":
        return temp * 9/5 + 32
    elif unit == "F":
        return (temp - 32) * 5/9
    else:
        print("Invalid unit. Please enter 'C' or 'F'")
        return None  # Added to ensure the function always returns a value

n = float(input("\nEnter the temperature in Celsius or Fahrenheit: "))
unit = input("Enter the unit ('C' for Celsius and 'F' for Fahrenheit): ")
print()

f = conversion(n, unit) # Call the function
opposite_unit = "F" if unit == "C" else "C" # Determine the opposite unit based on the original unit

if f is not None:  # Check if the conversion was successful
    print(f"The temperature in {opposite_unit} is {f:.2f}")  # 2 decimal places
