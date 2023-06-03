package old.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable {
	
	String id;
	String pwd;
	int luckyNo;
	
	public Externalization() {
		System.out.println("Default constructor running");
	}
	
	public Externalization(String id, String pwd, int luckyNo) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.luckyNo = luckyNo;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(pwd);
		out.writeInt(luckyNo);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id =	(String) in.readObject();
		pwd = (String) in.readObject();
		luckyNo =  in.readInt();
		
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalization externalization1 = new Externalization("ironborn","dracarus",7);
		
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(externalization1);
		
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalization externalization2 = (Externalization) ois.readObject();
		
		System.out.println("The usrid is : " + externalization2.id +"The Pwd is : "+ externalization2.pwd);
				
		
		
	}
}
