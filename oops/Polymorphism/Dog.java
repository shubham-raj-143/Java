package oops.Polymorphism;

public class Dog extends Pet{
	//We can override only methods not variables
	String name = "Doggy";  // Here Name in dog and Pet is same , So Dog does not override name of Pet
							// but it Hides the name of Pet for all SUBCLASSES for Dog.
	
	@Override
	public void walk()
	{
		System.out.println("Dog is walking");
	}
}
