package old.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Fruits implements Comparator<StringBuffer> {

	StringBuffer sb1 = new StringBuffer("Apple");
	StringBuffer sb2 = new StringBuffer("Mango");
	StringBuffer sb3 = new StringBuffer("Guava");
	StringBuffer sb4 = new StringBuffer("Banana");
	StringBuffer sb5 = new StringBuffer("Grapes");
	StringBuffer sb6 = new StringBuffer("Watermelon");
	StringBuffer sb7 = new StringBuffer("Kiwi");
	StringBuffer sb8 = new StringBuffer("Cantalope");
	

	String str1 = new String("Apple");
	String str2 = new String("Mango");
	String str3 = new String("Guava");
	String str4 = new String("Banana");
	String str5 = new String("Grapes");
	String str6 = new String("Watermelon");
	String str7 = new String("Kiwi");
	String str8 = new String("Cantalope");

	public static void main(String[] args) {

		Fruits fruits = new Fruits();

		Set<StringBuffer> fruitsname = new TreeSet<>(new Fruits());
		
		fruitsname.add(fruits.sb1);
		fruitsname.add(fruits.sb2);
		fruitsname.add(fruits.sb3);
		fruitsname.add(fruits.sb4);
		fruitsname.add(fruits.sb5);
		fruitsname.add(fruits.sb6);
		fruitsname.add(fruits.sb7);
		fruitsname.add(fruits.sb8);
		

		Iterator<StringBuffer> itr = fruitsname.iterator();
		while (itr.hasNext())
		{

			StringBuffer sb = itr.next();
			String s = sb.toString();

			if(s.equals("Apple"))
			{
				itr.remove();
			}
			
			StringBuffer snew = (StringBuffer)itr.next();
			System.out.println("Stringbuffer treeset : " +snew);

		}

		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		Set<String> fruitsnamestr = new TreeSet<String>();
		
		fruitsnamestr.add(fruits.str1);
		fruitsnamestr.add(fruits.str2);
		fruitsnamestr.add(fruits.str3);
		fruitsnamestr.add(fruits.str4);
		fruitsnamestr.add(fruits.str5);
		fruitsnamestr.add(fruits.str6);
		fruitsnamestr.add(fruits.str7);
		fruitsnamestr.add(fruits.str8);
		

		Iterator<String> itr1 = fruitsnamestr.iterator();
		while (itr1.hasNext())
		{

			String str = (String)itr1.next();

			if(str.equals("Mango"))
			{
				itr1.remove();
				System.out.println(str  + " : Removed");
			}
			String strnew = (String)itr1.next();
			System.out.println("String treeset : " +strnew);

		}

		


	}

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) 
	{
		String s1 = sb1.toString();
		String s2 = sb2.toString();

		return s2.compareTo(s1);



	}
}
