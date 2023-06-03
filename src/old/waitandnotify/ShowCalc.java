package old.waitandnotify;

public class ShowCalc 
{
	public static void main(String[] args)
	{
		
		DoCalc doCalc = new DoCalc();
		doCalc.start();
		
		synchronized (doCalc)
		{
			System.out.println("main thread waits for the child thread");
			try
			{
				doCalc.wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread gets the notification");
			System.out.println(doCalc.total);
		}
	}

}
