
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
   aa: for (int b = 0;  b <  3 ; b++ )
     
    {
	   
	   bb: for(int a = 0; a< 82 ; a++) 
	   {
		   System.out.println( a + " loop continue working");
		   
		   if (a==12) 
		   {
			   break bb;
			   
		   }
	   }
	  
	   if(b==3) {
		  continue;
	   }
	System.out.println(  "continue working"+  b);
    }
	}

}
