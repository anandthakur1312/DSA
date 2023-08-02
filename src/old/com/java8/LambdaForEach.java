package old.com.java8;

import java.util.Arrays;
import java.util.List;


public class LambdaForEach
{	
	//Consumer<T>
	
	public static void main(String[] args)
	{
		
		List<Integer> values = Arrays.asList(2,3,5,6);
		
		System.out.println("Printing using Internal for Each");
		
		//Internal for each
		
		values.forEach(i -> System.out.println(i));
		
	}

}
