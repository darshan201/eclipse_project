package darshanjava;

public class Abstarct {

	public static void main(String[] args) {
		Gas obj1 = new Petrol();
		//Gas obj2 = new diesel();
		obj1.method();
		//obj2.method();
	}

}

abstract class Gas {
	Gas() {
		System.out.println("constructor output");
	}

	abstract void method();

}

class Petrol extends Gas

{
	public void method() {
		System.out.println("petrol  is gas ");
	}
}

class diesel extends Gas {
	void method() {
		System.out.println("diesel is gas ");
	}
}