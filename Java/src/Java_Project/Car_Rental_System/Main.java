package Java_Project.Car_Rental_System; // Car Rental System in Java

import java.util.ArrayList; // Importing necessary classes
import java.util.List;  // Importing necessary classes for ArrayList and List
import java.util.Scanner;   // Importing Scanner class for user input

class Car { // Class representing a car in the rental system
    // Attributes of the Car class
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {  // Constructor to initialize car attributes
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {  // Getter method for carId
        return carId;   
    }

    public String getBrand() {  // Getter method for brand
        return brand;
    }

    public String getModel() {  // Getter method for model
        return model;
    }

    public double calculatePrice(int rentalDays) {  // Method to calculate rental price based on days rented
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() {  // Method to check if the car is available for rent
        return isAvailable;
    }

    public void rent() {    // Method to mark the car as rented
        isAvailable = false;
    }

    public void returnCar() {   // Method to mark the car as available again
        isAvailable = true;
    }
}

class Customer {    // Class representing a customer in the rental system
    // Attributes of the Customer class 
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {   // Constructor to initialize customer attributes
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() { // Getter method for customerId
        return customerId;
    }

    public String getName() {   // Getter method for name
        return name;
    }
}

class Rental {  // Class representing a rental transaction
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {   // Constructor to initialize rental attributes
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {   // Getter method for car
        return car;
    }

    public Customer getCustomer() { // Getter method for customer
        return customer;
    }

    public int getDays() {  // Getter method for days
        return days;
    }
}

class CarRentalSystem { // Class representing the car rental system
    private List<Car> cars; // List to store available cars
    private List<Customer> customers;   // List to store customers
    private List<Rental> rentals;   // List to store rental transactions

    public CarRentalSystem() {  // Constructor to initialize the car rental system
        cars = new ArrayList<>();   // Initializing the list of cars
        customers = new ArrayList<>();  // Initializing the list of customers
        rentals = new ArrayList<>();    // Initializing the list of rentals
    }

    public void addCar(Car car) {   // Method to add a car to the system
        cars.add(car);  // Adding car to the list of cars
    }

    public void addCustomer(Customer customer) {    // Method to add a customer to the system
        customers.add(customer);    // Adding customer to the list of customers
    }

    public void rentCar(Car car, Customer customer, int days) { // Method to rent a car to a customer
        if (car.isAvailable()) {    // Checking if the car is available for rent
            car.rent(); // Marking the car as rented
            rentals.add(new Rental(car, customer, days));   // Adding the rental transaction to the list of rentals

        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(Car car) {        // Method to return a rented car
        car.returnCar();    // Marking the car as available again
        Rental rentalToRemove = null;       // Variable to store the rental transaction to be removed
        for (Rental rental : rentals) {     // Looping through the list of rentals
            if (rental.getCar() == car) {   // Checking if the car is in the rental list
                rentalToRemove = rental;    // Storing the rental transaction to be removed
                break;
            }
        }
        if (rentalToRemove != null) {   // Checking if the rental transaction was found
            rentals.remove(rentalToRemove); // Removing the rental transaction from the list of rentals
        } else {
            System.out.println("\nCar was not rented.");  // Message if the car was not rented
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("\n== Rent a Car ==\n");
                System.out.print("Enter your name: ");
                String customerName = scanner.nextLine();

                System.out.println("\nAvailable Cars:");
                for (Car car : cars) {  // Loop through the list of cars
                    // Display only available cars
                    if (car.isAvailable()) {
                        System.out.println(car.getCarId() + " - " + car.getBrand() + " " + car.getModel()); 
                    }
                }

                System.out.print("\nEnter the car ID you want to rent: ");  
                String carId = scanner.nextLine();

                System.out.print("Enter the number of days for rental: ");
                int rentalDays = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName);  // Create a new customer with a unique ID
                addCustomer(newCustomer);   // Add the new customer to the list of customers

                Car selectedCar = null; // Variable to store the selected car
                for (Car car : cars) {
                    if (car.getCarId().equalsIgnoreCase(carId) && car.isAvailable()) {    // Check if the car ID matches and if the car is available
                        selectedCar = car;
                        break;
                    }
                }

                if (selectedCar != null) {  // If the selected car is found
                    double totalPrice = selectedCar.calculatePrice(rentalDays); 
                    System.out.println("\n== Rental Information ==\n");
                    System.out.println("Customer ID: " + newCustomer.getCustomerId());
                    System.out.println("Customer Name: " + newCustomer.getName());
                    System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("\nCar rented successfully by " + newCustomer.getName());  // Confirmation message
                    } else {
                        System.out.println("\nRental canceled.");
                    }
                } else {
                    System.out.println("\nInvalid car selection or car not available for rent.");
                }
            } else if (choice == 2) {       // Option to return a car
                System.out.println("\n== Return a Car ==\n");
                System.out.print("Enter the car ID you want to return: ");
                String carId = scanner.nextLine();

                Car carToReturn = null;     // Variable to store the car to be returned
                for (Car car : cars) {
                    if (car.getCarId().equalsIgnoreCase(carId) && !car.isAvailable()) {   // Check if the car ID matches and if the car is not available (i.e., rented)
                        carToReturn = car;
                        break;
                    }
                }

                if (carToReturn != null) {      // If the car to return is found
                    Customer customer = null;   // Variable to store the customer who rented the car
                    for (Rental rental : rentals) {     // Loop through the list of rentals
                        if (rental.getCar() == carToReturn) {   // Check if the car is in the rental list
                            customer = rental.getCustomer();    // Get the customer who rented the car
                            break;
                        }
                    }

                    if (customer != null) {     // If the customer is found
                        returnCar(carToReturn);
                        System.out.println("\nCar returned successfully by " + customer.getName()+ "\nThank you for using the Car Rental System!");   // Confirmation message
                    } 
                } 
                else {
                    System.out.println("\nInvalid car ID or car is not rented.");
                }
            } 
            else if (choice == 3) {
                break;
            } 
            else {
                System.out.println("\nInvalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}
public class Main{
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 200.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 400.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 600.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}