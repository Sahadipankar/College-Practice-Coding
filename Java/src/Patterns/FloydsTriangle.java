package Patterns;

public class FloydsTriangle {
    public static void main(String args[]) {
        int n = 8;
        int number = 1;
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
