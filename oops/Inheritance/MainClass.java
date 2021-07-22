package oops.Inheritance;
/*Inheritance is-a relationship. We use inheritance only if an is-a relationship
 * is present between the two classes...eg: A car is a vehicle, Orange is a fruit
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher("Shubham");
		
		t.eat();
		t.walk();
		t.teach();
		
		Singer s = new Singer("Raj");
		s.name = "Raj";
		s.sing();
		s.eat();
		
		// Implicit / Up-casting
		Person p = t;
		
		// Explicit / Down-Casting
		Teacher t1 = new Teacher("RajSingh");
		Person p1 = t1;
		Teacher t2 = (Teacher)p1;
		
		boolean y0 = t1 instanceof Teacher;
		System.out.println(t1 instanceof Teacher);
		System.out.println(s instanceof Singer);
		System.out.println(t1 instanceof Person);
		System.out.println(t2 instanceof Person);
		System.out.println(p instanceof Singer);
		System.out.println(p instanceof Teacher);

	}

}
