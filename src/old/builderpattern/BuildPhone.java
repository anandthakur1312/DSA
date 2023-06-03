 package old.builderpattern;

public class BuildPhone {
	
	private String operatingSystem;
	private int screenSize;
	private int battery;
	private String color;
	
	public BuildPhone setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
		return this;
	}
	
	public BuildPhone setScreenSize(int screenSize)
	{
		this.screenSize = screenSize;
		return this;
	}
	
	public BuildPhone setBattery(int battery)
	{
		this.battery = battery;
		return this;
	}
	
	public BuildPhone setColor(String color)
	{
		this.color = color;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(operatingSystem, screenSize, battery, color);
		
	}

}
