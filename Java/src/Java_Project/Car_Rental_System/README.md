# 🚗 Car Rental System – Console Application in Java

Welcome to the **Car Rental System**, a Java-based console project that simulates real-world car rental operations. It offers easy-to-use options for renting and returning cars along with simple customer management through a terminal interface.  

---

## 📋 Table of Contents

- [Features](#features)
- [Services & Menu Options](#services--menu-options)
  - [1. Rent a Car](#1-rent-a-car)
  - [2. Return a Car](#2-return-a-car)
  - [3. Exit](#3-exit)
- [Class Structure](#class-structure)
- [Future Roadmap](#future-roadmap)
- [Contributions](#contributions)

---

## ✨ Features

- 🚘 **Rent a Car**: View and choose available cars to rent.
- 🔁 **Return a Car**: Return rented vehicles and update availability.
- 👤 **Customer Auto-Registration**: New customers are automatically registered during rental.
- 📄 **Rental Management**: Maintains in-memory rental records.
- 🛠️ **Simple Console Interface**: Clean and beginner-friendly terminal navigation.

---

## 📱 Services & Menu Options

### ===== Car Rental System =====

Displayed when the application starts:

===== Car Rental System =====

Rent a Car

Return a Car

Exit
Enter your choice: _

---

### 1️⃣ Rent a Car

**Description**: Lets the user rent an available car.

**Steps**:
- Enter customer name.
- View list of available cars.
- Enter car ID and rental days.
- Confirm rental.

**Console Output Example**:

== Rent a Car ==

Enter your name: John

Available Cars:
C001 - Toyota Camry
C002 - Honda Accord
C003 - Mahindra Thar

Enter the car ID you want to rent: C002
Enter the number of days for rental: 3

== Rental Information ==

Customer ID: CUS1
Customer Name: John
Car: Honda Accord
Rental Days: 3
Total Price: $210.00

Confirm rental (Y/N): Y

Car rented successfully.

---

### 2️⃣ Return a Car

**Description**: Returns a rented car based on car ID.

**Steps**:
- Enter car ID.
- If rented, return the car and remove rental record.

**Console Output Example**:

== Return a Car ==

Enter the car ID you want to return: C002

Car returned successfully by John

---

### 3️⃣ Exit

**Description**: Ends the program.

Thank you for using the Car Rental System!

---

## 🧱 Class Structure

| Class             | Description |
|-------------------|-------------|
| **Car**           | Contains car details like ID, brand, model, price, and availability. |
| **Customer**      | Stores customer ID and name. Automatically generated on rental. |
| **Rental**        | Links a car to a customer for a specific number of days. |
| **CarRentalSystem** | Manages cars, customers, and rentals. Handles menu UI and actions. |
| **Main**          | Entry point. Adds sample cars and runs the menu system. |

---

## 🛣️ Future Roadmap

- 📜 Add rental history display.
- 🧑‍💼 Enable registered customer login.
- 💾 Implement file/database storage.
- 🖥️ Add GUI using JavaFX or Swing.

---

## 🤝 Contributions

We welcome contributions to improve the system!  
Feel free to:
- 🐞 Open issues  
- 🌱 Suggest enhancements  
- 📬 Submit pull requests  

Let’s build something great together! 🚀
