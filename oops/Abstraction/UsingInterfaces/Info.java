package oops.Abstraction.UsingInterfaces;
/* INTERFACES:
 *  As We know that we can extend only one class and java does not support multiple inheritance.
 *  Now what if subclass wants to inherit the properties of two classes
 *  
 *  So in java we cannot extend multiple classes but we can implement multiple interfaces
 */

/*
 * 1> Make all its superclass which u want to implement as interfaces
 * 2> now we can implement those interfaces in subclass by using keyword implement.
 * 3> We can also make classes abstract to avoid complexity.  
 */

/*
 * An INTERFAcE defines a set of specifications that other classes must implement
 * 
 * interface Polygon{
 * 		public void getArea();
 * }
 * 
 * Here, Polygon is an interface. We have used the interface keyword to declare an interface
 * 
 * We can implement interfaces in other classes. In java, we use the implements keyword
 * to implement interfaces.
 * 
 * class Rectangle implements Polygon{
 * 		public void getArea(){
 * 			int length = 5, breadth=  6;
 *          System.out.Println("Area"+(Length*breadth));
 * 
 * 	}
 * }
 */

/*
 * WHY USE INTERFACES::
 * 1>Interfaces provide specifications that a class(which implements it) must follow.
 * 
 * 2> Similar to abstract classes. interface help us to achieve abstraction in java. 
 * 
 * 3>In Java, multiple inheritance is not possible by extending classes. How ever class can implement
 * multiple interfaces.This allows us to get the functionality of multiple interface in java.
 */

/*
 * IMPORTANT POINTS ABOUT INTERFACES:
 * 1> We cannot instantiate an interface in java.
 * 
 * 2> Interfaces can't have constructors because we can't instantiate them and interfaces can't
 * have method with body(before java 8)
 * 
 * 3> By default any attribute of interface is public, static and final, so we don't need to provide
 * access modifiers to the attributes but if we do, compiler doesn't complain about it either.
 * 
 * 4> By default interface methods are implicitly abstract and public , it makes total sense
 * because the method don't have the body and so that subclasses can provide the method implementation
 * 
 * 5>An interface can't extend any class but it can extend another interface.
 * 
 * 6>A class implementing an interface must provide implementation for all of its method unless 
 * its an abstract class.
 */
public class Info {

}
