package Basics;

class Stud {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
}

public class Student_Def {
    public static void main(String args[]) {
        Stud s1 = new Stud();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();
        Stud s2 = new Stud();
        s2.name = "Shradha";
        s2.age = 22;
        s2.getInfo();
    }
}
