package old.interviewprograms;

public class Singleton {

	private Singleton x = null;
	
	private Singleton(){
		
	}
	
	public Singleton getInstance(){
		
		if (x == null)
		{
			x = new  Singleton();
		}
		return x;
	}




public static void main(String[] args){
	
	Singleton singleton = new Singleton();
	Singleton y = singleton.getInstance();
    }

	
}