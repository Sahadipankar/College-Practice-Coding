package Basics;

import java.util.Scanner;

class Clg_Student {
    String name;
    int age;
    String grade;

    // Constructor when grade is not provided
    public Clg_Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = null;  // Grade remains null if not provided
    }

    // Constructor when grade is provided
    public Clg_Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        // Ensure grade is displayed only if it's not null or empty
        if (grade != null && !grade.isEmpty()) {
            System.out.println("Grade: " + grade);
        }
    }
}

public class Clg_Stud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Name
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        // Input: Age
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline after nextInt()

        // Input: Grade (optional)
        System.out.print("Enter grade (press Enter to skip): ");
        String grade = sc.nextLine();

        // Create the Clg_Student object based on whether grade is provided or not
        Clg_Student Clg_Student;
        if (grade.isEmpty()) {
            Clg_Student = new Clg_Student(name, age);  // Constructor without grade
        } else {
            Clg_Student = new Clg_Student(name, age, grade);  // Constructor with grade
        }

        // Display Clg_Student information
        System.out.println("\nClg_Student Details:");
        Clg_Student.displayInfo();

        sc.close();
    }
}
