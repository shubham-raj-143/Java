package oops.Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		// Upcasting
		Pet p =d;   // as a dog is a pet
		Animal a = d;  //as a dog is an animal 
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		d.walk();   // output: Dog is walking
		p.walk();  // output: Dog is walking
		// Therefore in both case Output will be Dog is walking.
		//It does not check it in compile time but in RunTime
		//Therefore it is RunTime Polymorphism
		//When we override a method , then which behavior is taken can only be decided during runtime
		// Not in CompileTime
		// Here only dog method is build So returns Dog is walking in both cases.
		
	//	a.walk();     Compile Time Error
		
		
		//CompileTime Polymorphism--- Thr method to be called is known before run i.e during compile
		//time due to overloading(as parameters are different and method name is same)
		greetings();    // we know 1st method is called
		greetings("Shubham");
		greetings("Love u", 3000);
		
		
		
		
	}
	
	// Method Overloading----CompileTime Polymorphism
	public static void greetings() {
		System.out.println("Hi, there");
	}
	public static void greetings(String s) {
		System.out.println(s);
		
	}
	public static void greetings(String s, int count) {
		System.out.println(s+" "+count);
		
	}

}
