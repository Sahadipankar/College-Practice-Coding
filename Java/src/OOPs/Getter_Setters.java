package OOPs;

class Person {
    // Private fields
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;  // Returns the value of the 'name' field
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;  // Sets the value of the 'name' field
    }

    // Getter for 'age'
    public int getAge() {
        return age;  // Returns the value of the 'age' field
    }

    // Setter for 'age'
    public void setAge(int age) {
        if(age > 0) {  // Adding validation to ensure age is positive
            this.age = age;  // Sets the value of the 'age' field
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Getter_Setters {    
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person();
        
        // Using setter methods to set values
        person.setName("Alice");
        person.setAge(30);

        // Using getter methods to access values
        System.out.println("\nName: " + person.getName());  // Output: Alice
        System.out.println("Age: " + person.getAge());    // Output: 30
    }
}