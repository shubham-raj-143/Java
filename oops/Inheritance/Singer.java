package oops.Inheritance;

public class Singer extends Person {
	
	//If we have created a constructor in Parent class then We have to create same to same constructor of all its 
	//child class and call the constructor of parent class from child class 
	//via SUPER Keyword---IMPORTANT 
	//Here if Any one class (Teacher or Singer) will not have constructor calling Parent Constructor,
	//then error will be called
	public Singer(String name) {
		super(name);
	}
	public void sing() {
		System.out.println(name+" is singing");
	}
	@Override
	public void eat() {
		System.out.println("Singer "+name+" is eating");
	}
	public static void laughing() {
		System.out.println("The Singer is laughing");
	}

}
