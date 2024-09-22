package Basics;

class Myclass {
	int height;
	
	Myclass () {
	System.out.println ("\nHeight: ");
	height = 10;
	}

	Myclass (int i) {
	System.out.println ("\nHeight of class is " + i + " feet.");
	height = i;
	}

	void Show () {
	System.out.println ("\nClass is: " + height + " feet");
	}

	void Show (String s) {
	System.out.println (s + "\nClass is: " + height + " feet");
	}
}

public class Height_Constructor {
	public static void main (String args []) {
	Myclass c = new Myclass (20);
	c.Show ();
	c.Show ("\nOverload Method");
	Myclass c1 = new Myclass();
	c1.Show();
	}
}