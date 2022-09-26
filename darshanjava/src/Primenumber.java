public class Primenumber {

	public static void main(String[] args) {

		int a = 15;
		int b = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a / i == 0) {
				b = b + 1;

			}
		}
		if (b > 1) {
			System.out.println("number is not prime");

		} else {
			System.out.println("number is prime");

		}

	}
}
