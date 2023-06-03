package old.collections;

import java.util.Comparator;

public class ReverseSortEmp implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2)
	{
		
		return emp2.compareTo(emp1);
		
		
	}

}
