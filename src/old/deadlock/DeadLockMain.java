package old.deadlock;

public class DeadLockMain extends Thread {
	
	DeadLockA deadLockA = new DeadLockA();
	DeadLockB deadLockB = new DeadLockB();
	
	private void begin() {
		this.start();
		deadLockA.AFirst(deadLockB);
		
	}
	
	public void run(){
		deadLockB.BFirst(deadLockA);
	}
	

	public static void main(String[] args) {
	
		DeadLockMain deadLockMain = new DeadLockMain();
		
		deadLockMain.begin();
		
		
		

	}


	

}
