package OOPs;

class newShape {
    public void newArea() {
        System.out.println("displays area");
    }
}

class newTriangle extends newShape {
    public void newArea(int l, int h) {
        System.out.println(1.0/2*l*h);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        newTriangle t = new newTriangle();
        System.out.println();
        t.newArea(); // Output: displays area
        t.newArea(10, 20); // Output: 100
    }
}
