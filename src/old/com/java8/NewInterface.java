package old.com.java8;

interface Phone
{
	void Call();
	
	default void Messaging()
	{
		System.out.println("I am the new feature");
	} 
}

class AndroidPhone implements Phone
{

	@Override
	public void Call()
	{
		System.out.println("Android Phone Calling");
		
	}
	
}

public class NewInterface
{
	public static void main(String[] args)
	{
		Phone phone = new AndroidPhone();
		phone.Call();
		phone.Messaging();
	}
}
