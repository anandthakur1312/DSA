package old.multithreading;

public class CardDistribution extends Thread
{
	public static Thread mt;
	
	public void run()
	{
		
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i = 0; i<=10; i++)
		{
			System.out.println("card distribution started");
			
		}
		
	}
}
