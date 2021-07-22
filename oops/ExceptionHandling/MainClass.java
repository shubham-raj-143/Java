package oops.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		try 
		{
			int a = 5, b=0, d=3;
			int c=a/d;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" occurred !Please check your code.");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index should be in the range from 0 to size-1 of array");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Chexk your casting carefully");
		}
		// finally is like default in switch case .... It will be executed everytime time whether catches error or not.
		finally
		{
			System.out.println("Sorry for inconvience");
		}
		
		System.out.println("Very imp code\nNeeds to be executed");
		
		func1();
	}
	static void func1()
	{
		int a = 5, b=3;
		int c=a/b;
		System.out.println(c);
		
		// throw and throws
		
//		boolean isDanger = true;
//		if(isDanger)
//		{
//			throw new ArrayIndexOutOfBoundsException("Danger was coming");
//		}
		
		
	//	Thread.sleep(1000);   //ERROR as not under try catch block. As it might throw INTERRUPTED exception.
		
		try {
			Thread.sleep(1000);  // Will sleep the program for 1 sec and then after that next line execution will start.
								// Thread is to be always written under try block.
			func2();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+" occurred");
		}
	}
	//throws--
	static void func2() throws ArrayIndexOutOfBoundsException
	{
		boolean isDanger = true;
		if(isDanger)
		{
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}

}
