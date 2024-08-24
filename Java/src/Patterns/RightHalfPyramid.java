package Patterns;

public class RightHalfPyramid {
    public static void main(String args[]) {
       int n = 6;
      System.out.println();

       for(int i=n; i>=1; i--) {
           for(int j=1; j<i; j++) {
               System.out.print("  ");
           }

           for(int j=0; j<=n-i; j++) {
               System.out.print(" *");
           }
           System.out.println();
       }
    }
}
