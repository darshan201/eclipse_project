package darshanjava;

class animal {
	void method(animal a) {System.out.println("output   1");}
}

class dog extends animal {

	void method(animal a)// upcasting
	{
		System.out.println("output   2 ");
	}
}

public class Covarient {

	public static void main(String[] args) {
		
              animal A = new dog(); //upcasting 
              
              A.method(A);
               dog d = (dog)A;
               d.method(A);
              
              if (A instanceof animal ) 
              {
            	  System.out.println("output");
              }
	
	}

}
