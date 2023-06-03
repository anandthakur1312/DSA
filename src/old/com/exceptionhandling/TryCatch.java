package old.com.exceptionhandling;

public class TryCatch
{
	public static void main(String[] args)
	{
		doStuff();
		
		System.out.println("hello from main");
	}

	public static void doStuff()
	{
		try
		{
		doMoreStuff();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("hello from doStuff after catch");
		}
		
	}

	public static void doMoreStuff() throws ArithmeticException
	{
		
		System.out.println(10/0);
		System.out.println("hello from after try doMoreStuff");
		
	}
}
