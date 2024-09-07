import java.util.*;

public class Largest {
	public static void main (String args []) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("\nEnter the First Number: ");
	int first = sc.nextInt();

	System.out.print("Enter the Second Number: ");
	int second = sc.nextInt();

	System.out.print("Enter the Third Number: ");
	int third = sc.nextInt();
	
	if (first > second && first > third) {
		System.out.println("\n" + first + " is the Largest Number");
		}
	else if (second > first && first > third) {
		System.out.println("\n" + second + " is the Largest Number");
		}
	else {
		System.out.println("\n" + third + " is the Largest Number");
		}
	}
}