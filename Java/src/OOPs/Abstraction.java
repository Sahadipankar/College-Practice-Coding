package OOPs;

abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("This animal breathes air");
    }

    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {    //Parent class constructor gets called first. This is called Constructer Chaining

    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.breathe();

        System.out.println();
        
        Chicken chicken1 = new Chicken();
        chicken1.walk();
        chicken1.breathe();
    }
}