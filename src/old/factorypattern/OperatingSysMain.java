package old.factorypattern;

public class OperatingSysMain 
{
	public static void main(String[] args) {
		
		FactoryOS fos = new FactoryOS();
		
		OperatingSystemI os = fos.getOS("Apple");
		os.spec();
		
		OperatingSystemI os1 = fos.getOS("Android");
		os1.spec();
		
		OperatingSystemI os2 = fos.getOS("Windows");
		os2.spec();
		
		
	}

}
