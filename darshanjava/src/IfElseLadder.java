
public class IfElseLadder
{

	public static void main(String[] args)
	{
		int a = 12;
		if (a<25) 
		{
			System.out.println("fail");
		}
		else if ((a==25) || (a<45))
		{
			System.out.println("gread C");
		}
		else if ((a==45) || (a<90))
		{
			System.out.println("gread b");
		}
		else 
		{
			System.out.println("pass");
		}
	}

}
