
public class Overloading {

	public static void main(String[] args) {
		Icic i = new Icic();
		Bmo b = new Bmo();
		Scotia s = new Scotia();
		i.method();
		b.method();
		s.method();

	}
}

class Bank {
	int method() {
		
		
		System.out.println("2");
		return 1;
	}
}

class Icic extends Bank {
	
	int method() {
		super.method();
		System.out.println("52");
		return 1;
	}
}

class Bmo extends Bank {

	int method() {
		System.out.println("23");
		return 1;
	}
}

class Scotia extends Bank {

	int method() {
		System.out.println("56");
		return 1;
	}
}
