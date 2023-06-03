package old.multithreading;

public class VenueFixing
{
	
	public static void main(String[] args)
	{
		CardDistribution.mt = Thread.currentThread();
		CardDistribution cardDistribution = new CardDistribution();
		cardDistribution.start();
		
		for(int j = 0; j<=10; j++)
		{
			System.out.println("Venue Fixing is under process");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
