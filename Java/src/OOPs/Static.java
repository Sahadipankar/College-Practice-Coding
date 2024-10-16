package OOPs;

class Student {
    static String school;
    String name;
}

public class Static {
    public static void main(String args[]) {
        Student.school = "Calcutta Public School";
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Raj";
        s2.name = "Sneha";
        System.out.println(s1.name);            // Called by Object name
        System.out.println(Student.school);     //Called by Class name as static variable is class variable
        System.out.println(s2.name);
        System.out.println(Student.school);
    }
}