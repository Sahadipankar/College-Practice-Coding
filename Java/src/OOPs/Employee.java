package OOPs;

import java.util.Scanner;

class NewEmployee {
    String name, address, designation;
    int age, basic, HRA, medical, travel, other, salary;

    public void inputSalary () {
        System.out.print("Enter the Basic Salary: ");
        Scanner sc = new Scanner(System.in);
        basic = sc.nextInt();
        sc.close();
    }

    public int calSalary () {
        HRA = basic * 25 / 100;
        medical = basic * 10 / 100;
        travel = basic * 5 / 100;
        other = basic * 5 / 100;
        salary = basic + HRA + medical + travel + other;
        return salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        
        NewEmployee emp1 = new NewEmployee();
        emp1.inputSalary();
        System.out.println("Total Salary: " + emp1.calSalary());
    }
}
