package OOPs;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("Calculating Area of Triangle");
    }
}

class Circle extends Shape {
    @Override
    public void area() {
        System.out.println("Calculating Area of Circle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(); // Triangle object
        shape1.area(); // Calls overridden method in Triangle class

        Shape shape2 = new Circle(); // Circle object
        shape2.area(); // Calls overridden method in Circle class
    }
}
