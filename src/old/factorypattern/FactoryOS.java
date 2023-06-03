package old.factorypattern;

public class FactoryOS {
	
	public OperatingSystemI getOS(String str)
	{
		if(str.equals("Apple"))
			return new AppleOS();
		else if (str.equals("Android")) {
			return new AndroidOS();
		}
		else
		return new WindowsOS();

	}
	
}
