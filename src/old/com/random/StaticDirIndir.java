package old.com.random;

public class StaticDirIndir
{
	static int i =10;
	
	static
	{
		m1();
		System.out.println(i);
		
	}
	
	public static void main(String[] args)
	{
		
	}

	private static void m1()
	{
		System.out.println(i);
		
	}
}
