package oops.Inheritance;
//Method Overriding : What happens if same method is define in both-- Superclass and Subclass
                     // In that case method in subclass overrides the method in superclass.
public class Teacher extends Person {
	
	//Constructor[same name as class]
	public Teacher(String name)
	{
		super(name);  // here first Constructor of parent class will be called then
						//Constructor of Teacher Class will be called.
		System.out.println("Inside Teacher Constructor");
	}
	public void teach() {
		System.out.println(name+" is teaching");
	}
	@Override    // here eat() is in Person(Superclass) and Teacher & Singer[Subclasses] . 
					//So we can override
	public void eat() {
		super.eat();//If we want to access Parent Class from Child Class Then we use Super Keyword.
					// Here first eat() of parent will be executed the Child will be executed
		System.out.println("Teacher "+name+" is eating");
	}
	public static void laughing() {
		System.out.println("The Teacher is laughing");
	}
}
