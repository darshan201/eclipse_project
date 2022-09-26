
class Dog {
	String name;
	int id;

	public Dog(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

class Cat {
	Dog d;// aggregation
	int id1;

	public Cat(Dog d, int id1) {
		this.d = d;
		this.id1 = id1;
	}

	public void display() {
		System.out.println( id1);
		System.out.println(d.id + " " + d.name);// method reusability/ );
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Dog d1 = new Dog(12, "darshan");
		Cat c1 = new Cat(d1, 45);

		c1.display();

	}
}



/*
 * class cat public void n1() { System.out.println("i am cat");
 * 
 * } } class mew extends dog { public void o1() {
 * System.out.println("i am mew");
 * 
 * } } public class Multilevel {
 * 
 * public static void main(String[] args) {
 * 
 * mew b1 = new mew(); b1.o1();
 * 
 * b1.m1(); cat a1 = new cat();
 * 
 * a1.n1();
 * 
 * } }
 * 
 */
