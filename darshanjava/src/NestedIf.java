
public class NestedIf {

	public static void main(String[] args) {
		int age =52;
		int weight = 46;
		if (age>18) 
		{
			if (weight>50) 
			{
				
				System.out.println("you are goo to go for blood donation");
				
			}
			else if (weight<40) 
			{
				System.out.println("you are kuposan no sikar");
			}
			else
			{
				System.out.println("you are not allow to donate blood");
			}
		}
		else 
		{
			System.out.println("you must be more than 18 year old");
		}

	}

}
