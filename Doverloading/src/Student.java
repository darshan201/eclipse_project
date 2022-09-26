
 class Student {
	
		int id;
	    String studentName;
	    String studentCity;
	    
	    public Student() {
	    	this(12, "dada");
	    	System.out.println("le kachuko le");
	    	
	    }
	    public Student(int d, String e) {
	    	id = d;
	    	studentName = e;
	    	
	    	System.out.println("1");
	    	
	    }	
	    public Student(int a, String b,String c) {
	    	id = a;
	    	studentName =  b;
	    	studentCity = c;
	    	
	    	System.out.println("constuctor overloading create");
	    	
	    }
	public  void show() {
	     
	    System.out.println(id + "id is here");
	}
	
	public  void show1() {
		System.out.println( "my name is "+ studentName );
		System.out.println("my city is "+ studentCity );
		System.out.println(" my id is " + id );
	}
	

}




 