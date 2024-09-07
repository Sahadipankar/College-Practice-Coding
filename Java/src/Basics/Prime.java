import java.util.*;

public class Prime {
	public static void main (String args []) {
	Scanner sc = new Scanner (System.in);
	int prime = 0;
	
	System.out.print("\nEnter a Number: ");
	int num = sc.nextInt();
	
	if (num < 2) {
		System.out.print("\n" + num + " is not a Prime number.");	
		}
	
	else {  
   		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = 1;
				break;
				}
			}
		if (prime == 1) {
			System.out.print("\n" + num + " is not a Prime number.");
			}
		else System.out.print("\n" + num + " is a Prime number.");	
		}
	}
}
	