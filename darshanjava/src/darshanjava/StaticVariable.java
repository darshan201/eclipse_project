package darshanjava;

class StaticVariable {
	int a = 10;

	   void change(StaticVariable a) {
		 
          int c = this. a;
 

		System.out.println(c);
	}
 void change1() 
{
	  change(this);
}
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable();
		s1.change1();
		
	}
}

/*
 * int count = 12;
 * 
 * StaticVariable(){ count++; System.out.println(count);
 * 
 * } public static void main(String[] args) { StaticVariable s1 = new
 * StaticVariable(); StaticVariable s2 = new StaticVariable(); StaticVariable s3
 * = new StaticVariable(); } }
 */
/*
 * static int a = 10;
 * 
 * public static void main(String[] args) {
 * 
 * just2 s1 = new just2(); s1.just1(); int c = s1.b; System.out.println(c);
 * 
 * System.out.println( a );
 * 
 * }}
 * 
 * class just2 {
 * 
 * int b = 1;
 * 
 * public void just1() { int b = 11; System.out.println(b); } }
 * 
 */
