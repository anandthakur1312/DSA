package old.collections;

import java.util.HashMap;
import java.util.Map;

public class MapIterate
{

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("1", "Jan");

		//loop a Map
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		//Java 8 only, forEach and Lambda
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

	}

}
