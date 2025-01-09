package OOPs;

// Interface A
interface A {
    default void display() {
        System.out.println("\nDisplay method in Interface A");
    }
}

// Interface B inherits from A
interface B extends A {
    default void display() {
        System.out.println("\nDisplay method in Interface B");
    }
}

// Interface C inherits from A
interface C extends A {
    default void display() {
        System.out.println("\nDisplay method in Interface C");
    }
}

// Class D implements both B and C, resolving the ambiguity
class D implements B, C {
    @Override
    public void display() {
        // Resolving ambiguity by choosing one method to override
        B.super.display();  // Calls the display method from interface B
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();  // Output: Display method in Interface B
    }
}
