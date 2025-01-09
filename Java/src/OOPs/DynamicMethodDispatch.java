package OOPs;

// Base class
class Vehicle {
    // Method to be overridden
    void start() {
        System.out.println("Vehicle is starting");
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Overriding the start method
    @Override
    void start() {
        System.out.println("\nCar is starting with a roar");
    }
    void carStop() {
        System.out.println("Car is stopping");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    // Overriding the start method
    @Override
    void start() {
        System.out.println("\nBicycle is starting silently");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Creating a Vehicle reference but pointing to a Car object
        Vehicle myVehicle = new Car();
        // This will call the start method of Car class
        myVehicle.start(); // Output: Car is starting with a roar
        myVehicle.stop(); // Output: Vehicle is stopping
        
        
        // myVehicle.carStop(); // Error: carStop() method is not defined in Vehicle class


        // Changing the reference to point to a Bicycle object
        myVehicle = new Bicycle();
        // This will call the start method of Bicycle class
        myVehicle.start(); // Output: Bicycle is starting silently
        myVehicle.stop(); // Output: Vehicle is stopping
    }
}
