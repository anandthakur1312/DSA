package old.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreesetCustomObj 
{
	public static void main(String[] args) {

		Employee e1 = new Employee(201, "apple");
		Employee e2 = new Employee(601, "mango");
		Employee e3 = new Employee(401, "banana");
		Employee e4 = new Employee(501, "peach");
		Employee e5 = new Employee(801, "cherry");
		Employee e6 = new Employee(101, "guava");
		Employee e7 = new Employee(201, "avocado");
//		
//		SortByValue byValue = new SortByValue();
//		Map<Employee, String> treemapval = new TreeMap<Employee,String>(new SortByValue());
//		treemapval.put(e1, "a");
//		treemapval.put(e2, "m");
//		treemapval.put(e3, "b");
//		treemapval.put(e4, "p");
//		treemapval.put(e5, "c");
//		treemapval.put(e6, "g");
//		treemapval.put(e7, "a");

		
		Map<Employee, String> treemap = new TreeMap<Employee,String>();
		treemap.put(e1, "a");
		treemap.put(e1, "a");
		treemap.put(e3, "b");
		treemap.put(e4, "p");
		treemap.put(e5, "c");
		treemap.put(e6, "g");
		//treemap.put(e7, "a");

		System.out.println("Ascending Order TreeMap using toString Method" + treemap);


		System.out.println("Ascending Order TreeMap using Iterator");
		Iterator<Entry<Employee,String>> iterator = treemap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Employee,String> entry = (Entry<Employee,String>) iterator.next();
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}
		
		
		Map<Employee, String> treemaprev = new TreeMap<Employee,String>(new ReverseSortEmp());

		treemaprev.put(e1, "a");
		treemaprev.put(e2, "m");
		treemaprev.put(e3, "b");
		treemaprev.put(e4, "p");
		treemaprev.put(e5, "c");
		treemaprev.put(e6, "g");
		treemaprev.put(e7, "a");

		System.out.println("Descending Order Map using toString Method" + treemaprev);


		System.out.println("Descending Order Map using Iterator");
		Iterator<Entry<Employee,String>> iterator1 = treemap.entrySet().iterator();
		while (iterator1.hasNext()) {
			Entry<Employee,String> entry1 = (Entry<Employee,String>) iterator1.next();
			System.out.println("Key : " + entry1.getKey() + " Value :" + entry1.getValue());
		}

		Set <Employee> treesetrev = new TreeSet<Employee> (new ReverseSortEmp());
		treesetrev.add(e1);
		treesetrev.add(e2);
		treesetrev.add(e3);
		treesetrev.add(e4);
		treesetrev.add(e5);
		treesetrev.add(e6);
		treesetrev.add(e7);

		System.out.println("Descending Order using for loop");

		for(Employee emp : treesetrev)
		{
			emp.display();
		}

		
		System.out.println("Descending Order using iterator");

		Iterator<Employee> itrdec = treesetrev.iterator();
		while(itrdec.hasNext())
		{
			System.out.println(itrdec.next());
		}
		
		Set <Employee> treeset = new TreeSet<Employee> ();
		treeset.add(e1);
		treeset.add(e2);
		treeset.add(e3);
		treeset.add(e4);
		treeset.add(e5);
		treeset.add(e6);
		treeset.add(e7);

		System.out.println("Ascending Order using iterator");

		Iterator<Employee> itr = treeset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


		System.out.println("Ascending Order using for loop");
		for(Employee emp : treeset)
		{
			emp.display();
		}
		
		
	}



}
