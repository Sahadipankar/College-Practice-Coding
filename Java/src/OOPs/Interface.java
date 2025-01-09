package OOPs;

// Interface Animal: Represents behaviors common to all animals.
// By default, all methods in an interface are abstract and public.
interface NewAnimal {
    void walk(); // Abstract method to define walking behavior of an animal
}

// Interface Herbivores: Represents herbivorous animals.
interface Herbivores {
    void eatGrass(); // Abstract method to define grass-eating behavior
}

// Horse class implements both Animal and Herbivores interfaces.
class Cow implements NewAnimal, Herbivores {
    // Implements the walk method from Animal interface
    public void walk() {
        System.out.println("\nCow walks on 4 legs");
    }

    // Implements the eatGrass method from Herbivores interface
    public void eatGrass() {
        System.out.println("Cow eats Grass!");
    }
}

// Ostrich class implements only the Animal interface.
class Ostrich implements NewAnimal {
    // Implements the walk method from Animal interface
    public void walk() {
        System.out.println("\nOstrich walks on 2 legs");
    }
}

// Main class to demonstrate interface usage
public class Interface {
    public static void main(String args[]) {
        // Create an instance of Cow
        Cow cow1 = new Cow();
        cow1.walk(); // Calls the walk method of Cow
        cow1.eatGrass(); // Calls the eatGrass method of Cow

        // Create an instance of Ostrich
        Ostrich ostrich1 = new Ostrich();
        ostrich1.walk(); // Calls the walk method of Ostrich
    }
}