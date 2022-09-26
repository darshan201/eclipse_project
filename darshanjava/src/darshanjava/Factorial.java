
package darshanjava;

public class Factorial {

	public static void main(String[] args) {
		int a;
		int fact = 1;
		int number = 5;

		for (a = 1; a <= number; a++) {
			fact = fact * a;

		}
		System.out.println(number + " of factorial " + fact);

	}

}

//Java program to initialize the values from one object to another object.  
/*
 * class Student6 { int id; String name;
 * 
 * // constructor to initialize integer and string Student6(int i, String n) {
 * id = i; name = n; } Student6(){
 * 
 * }
 * 
 * // constructor to initialize another object
 * 
 * Student6(Student6 s) { id = s.id; name = s.name; }
 * 
 * 
 * void display() { System.out.println(id + " " + name); }
 * 
 * public static void main(String args[]) { Student6 s1 = new Student6(111,
 * "Karan"); Student6 s2 = new Student6();
 * 
 * 
 * s1.id = s2.id; s1.name=s2.name; s1.display(); s2.display(); } }
 */