package old.deadlock;

public class DeadLockB  {
	
	public synchronized void BFirst(DeadLockA a)
	{
		System.out.println("thread2 starts BFirst execution");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		a.last();
	}
	
	public synchronized void last()
	{
		System.out.println("This is the never reachable code");
	}
}
