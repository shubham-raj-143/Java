package oops.FinalKeyword;

public class MainClass extends Student{
//	@Override                 // Cannot be Overridden
//	public void getDescription()
//	{
//		System.out.println("Inside main class");
//	}
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1 = obj2; // reference of obj2 is in obj1
		
		final Student obj3 = new Student();
		// obj3 = obj1;  // We can not reference abj1 in obj3 now as obj3 is final NOW.
		
		//But we can change the variables in the final objects but not the reference of objects.
		obj3.notFinal = "Shubham";  //Correct
		
		//Final Method concept
		MainClass obj = new MainClass();
		obj.getDescription();

	}

}
