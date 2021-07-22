package oops.Abstraction.UsingAbstract;

/* Abstraction : (To reduce Complexity in a system) : Data Abstraction is a process of hiding
 * 				certain details and showing only essential information to the user.
 * 
 * 				It helps to reduce programming complexity and effort.
 * 
 * 				Abstraction can be achieved with either abstract classes or interfaces.
 * 
 */

/* 1> Abstract class can have abstract methods(methods without body) as well as concrete methods
 * (regular methods with body)
 * 
 * 2> Normal class (non-abstract class) cannot have abstract methods
 * 
 * 3> A abstract class cannot be instantiated, which means you are not allowed to create
 *   an object of it
 *   
 * 4> An abstract class must be extended and in a same way abstract method must be Overridden.
 *  
 */

/*Abstract class can have abstract and non-abstract methods,
  Abstract class cannot be instantiated.
  Abstract class can have final methods.
  Abstract class can have constructors and static methods also. */

/*
   abstract class base {
  public  int i;  // data member of abstract class   field
  abstract void abm(); // declared method not defined
public void nonabm()   // defined member function
  {  System.out.println("in non abstract method"); }
  final public void finonabm() // final method 
  { System.out.println("final non-abstract method"); }
  public static void snonabm() // static member function
  { System.out.println("Static method of abstract class"); }
  public base() // constructor
  { System.out.println("ZPC abstract base class");        i=90;        }  
}
class der extends base {
	  public der() 
	  { System.out.println("ZPC der"); }
	  
	      public void abm()
	      {  System.out.println("Defined function - Abstract type");  }
	}

	class test {
	 public static void main(String[] args)  {  
	   base d = new der(); 
	   d.i = 900; // base class data member
	   d.abm(); // invoking defined function - abstract function
	   d.snonabm(); // invoking static non abstract member function
	   d.finonabm(); // invoking final non abstract member function
	   d.nonabm(); // invoking non-final non abstract member function
	   }        
	}
 */

/*	
 *  Encapsulation: Data hiding is done for security reasons
 *  Abstraction : Data hiding is done to reduce complexity
 * 
 */

public class Intro {

}
