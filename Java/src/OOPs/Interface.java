package OOPs;

// Interface Animal: Represents behaviors common to all animals.
// By default, all methods in an interface are abstract and public.
interface NewAnimal {
    void walk(); // Abstract method to define walking behavior of an animal
}

// Interface Herbivores: Represents herbivorous animals.
// Again, all methods are abstract and public by default.
interface Herbivores {
    void eatGrass(); // Abstract method to define grass-eating behavior
}

// Horse class implements both Animal and Herbivores interfaces.
class Cow implements NewAnimal, Herbivores {
    // Implements the walk method from Animal interface
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    // Implements the eatGrass method from Herbivores interface
    public void eatGrass() {
        System.out.println("Horse eats Grass!");
    }
}

// Chicken class implements only the Animal interface.
class Ostrich implements NewAnimal {
    // Implements the walk method from Animal interface
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

// Main class to demonstrate interface usage
public class Interface {
    public static void main(String args[]) {
        // Create an instance of Horse
        Cow cow1 = new Cow();
        cow1.walk(); // Calls the walk method of Horse
        cow1.eatGrass(); // Calls the eatGrass method of Horse

        System.out.println();

        // Create an instance of Chicken
        Ostrich ostrich1 = new Ostrich();
        ostrich1.walk(); // Calls the walk method of Chicken
    }
}
