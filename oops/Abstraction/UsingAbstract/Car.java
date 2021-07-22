package oops.Abstraction.UsingAbstract;
/*abstract Keyword : After writing this keyword then we need not to write its implementation
 * 					Its implementation is written by its children
 */

//If we are making methods in a class as abstract then we also need to make that class as abstract.

//By making a class as abstract , we are making sure that it cannot be instantiated[we cannot make
// its objects.

/* When to make class as abstract?::: Where we feel that the class is just conceptual and its 
 * children are meaningful then we make class as abstract. Here If we go to repair shop then we 
 * just not say repair my Car{SuperClass), we provide the car name(Children) and say to repair
 */

//Under abstract class we can make non abstract methods
public abstract class Car {
	public abstract void accelerate();
	public abstract void breaking();
	public void honk() 
	{
		System.out.println("Car is honking");
	}
}
