package old.deadlock;

public class DeadLockA{
	
	public synchronized void AFirst(DeadLockB b)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("thread1 starts AFirst execution");
		b.last();
	}

	
	public synchronized void last()
	{
		System.out.println("This is the never reachable code");
	}
}
