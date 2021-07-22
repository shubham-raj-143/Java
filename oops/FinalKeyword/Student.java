package oops.FinalKeyword;
//Final Class Cannot be extended
public /*final*/ class Student {
	String notFinal="raj";
	final int roll;
	final String name;
	final static String grade; // while initializing in static block we need to make final variable also static
	// We can initialize them either in static block, or initializer block or within constructor
	
	//Initializer block
	{
		roll = 8;
	}
	//constructor
	public Student()
	{
		name="Shubham";
	}
	//static block
	static
	{
		grade = "A+";
	}
	
	//Final Method--Cannot be Overridden
	
	
	public final void getDescription()
	{
		System.out.println("The student name is "+name);
	}

}
