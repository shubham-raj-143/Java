package oops.Inheritance;

public class Person {
	protected String name; // We use protected Keyword when we only want that to be used by that class
						// or its child class only
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside Person Constructor");
	}
	
	public void walk() {
		System.out.println("Person "+name+" is walking");
	}
	public void eat() {
		System.out.println("Person "+name+" is eating");
	}
	public static void laughing() {
		System.out.println("The person is laughing");
	}

}
