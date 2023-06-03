package old.adapterpattern;

public class School
{
	public static void main(String[] args)
	{

		Assignment assignment = new Assignment();
		
		Pen p = new PenAdapter();
		assignment.setP(p);
		assignment.doAssignment("I am writing the assignment");

	}
	
}
