package OOPs;

interface InterfaceOne {
    void methodOne();
}

interface InterfaceTwo {
    void methodTwo();
}

class MultiInterface implements InterfaceOne, InterfaceTwo {
    public void methodOne() {
        System.out.println("\nMethod One Implementation");
    }
    public void methodTwo() {
        System.out.println("\nMethod Two Implementation");
    }
}

public class MultipleInheritance {
    public static void main(String args[]) {
        MultiInterface obj = new MultiInterface();
        obj.methodOne();
        obj.methodTwo();
    }
}