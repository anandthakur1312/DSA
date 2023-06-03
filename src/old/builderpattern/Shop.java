package old.builderpattern;

public class Shop {

	public static void main(String[] args) 
	{
		BuildPhone buildPhone = new BuildPhone();
		Phone phone = buildPhone
						.setBattery(150)
						.setColor("Black")
						//.setOperatingSystem("Android")
						.setScreenSize(21).getPhone();
		
		System.out.println(phone);
	}

}
