package old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	Dog dog1 = new Dog();
	Cat cat1 = new Cat();
	
	
	FileOutputStream fos = new FileOutputStream("abc.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(dog1);
	oos.writeObject(cat1);
	
	FileInputStream fis = new FileInputStream("abc.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object o = ois.readObject();
	
	if (o instanceof Cat)
    {
	   Cat cat2 = (Cat) o;
	   System.out.println(cat2.a + "----" + cat2.b);
    }
	
	
	else if (o instanceof Dog)
	{
		Dog dog2 = (Dog) o;
		System.out.println("Tail present in Animal : " + dog2.t);
		System.out.println("Present in Dog : " + dog2.i + "----" + dog2.j +"---"+ dog2.k);
		System.out.println("Coming from Rat : " + dog2.c.r.x);
		System.out.println("Password : " + dog2.pwd);
	}
    
    
	}

}
