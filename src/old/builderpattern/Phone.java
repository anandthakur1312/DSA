package old.builderpattern;

public class Phone 
{
	private String operatingSystem;
	private int screenSize;
	private int battery;
	private String color;
	
	public Phone()
	{
		System.out.println("Default Constructor");
	}
	
	public Phone(String operatingSystem, int screenSize, int battery, String color)
	{
		super();
		this.operatingSystem = operatingSystem;
		this.screenSize = screenSize;
		this.battery = battery;
		this.color = color;
	}

	@Override
	public String toString()
	{
		return "Phone [operatingSystem=" + operatingSystem + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", color=" + color + "]";
	}
	
	
	
	
}
