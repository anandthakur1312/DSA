package old.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	Cat c = new Cat();
	
	int i = 10;
	int j = 20;
	transient  int k = 30;
	transient String pwd = "secretcode";
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		String epwd = pwd+123;
		os.writeObject(epwd);
		
	}
	
	private void readObject(ObjectInputStream oi) throws ClassNotFoundException, IOException
	{
	oi.defaultReadObject();
	String epwd = (String) oi.readObject();
	pwd = epwd.substring(0,10);
	}

}
