package old.waitandnotify;

public class DoCalc extends Thread
{
	
	int total;
	
	public void run()
	{
		synchronized (this)
		{
			System.out.println("child thread starts the calculation");
			for(int i=0;i<=10;i++)
			{
				total = total+i;
				
			}
			System.out.println("child thread notifies main thread");
			this.notify();
		}
	}
	

}
