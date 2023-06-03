package old.com.java8;

interface Animal
{
	void eat(String str);
}

//class Dog implements Animal
//{
//
//	@Override
//	public void eat()
//	{
//		System.out.println("Dog Eating");
//		
//	}
//	
//}

public class LambdaAnnonymous
{
	public static void main(String[] args)
	{
//		Animal animal = new Dog();
		
//		Animal animal = new Animal() {
//			
//			@Override
//			public void eat()
//			{
//				System.out.println("Dog Eating Anonymous inner class");
//				
//			}
//		};
//		animal.eat();
		
//		
//		Animal animal2 = () -> System.out.println("Dog Eating Lambda Expression");
//		animal2.eat();
		
		Animal animal2 = s -> System.out.println("Dog Eating Lambda Expression " + s);
		animal2.eat("grass");
		
		
		
		
	}

}
