package Basics;

class Student {
	int rollNo;
	String name, course;

	Student (String n, int r, String c) {
	rollNo = r;
	name = n;
	course = c;
	}
	
	Student (String n, int r) {
	name = n;
	rollNo = r;
	course = "BCA";
	}

	void display () {
	System.out.println ("\nStudent Information");	
	System.out.println ("Name: " + name);
	System.out.println ("Roll No: " + rollNo);
	System.out.println ("Course: " + course);
	}
}

public class TestStudent {
	public static void main (String args []) {
	Student S1 = new Student ("Pratap", 1001, "B.Tech");
	Student S2 = new Student ("Navneet", 1002);
	
	S1.display();
	S2.display();
	}
}
