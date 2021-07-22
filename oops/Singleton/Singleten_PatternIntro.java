 package oops.Singleton;
// Singleton Pattern is mostly used in multithreaded and database applications.
//It is used in logging, caching, thread pools, configure settings etc

// We know that data transfer between I/o devices and memory is very slow.

// 1.> CACHING:::So when we are building 
// an app And if we are not making 
// Singleton Pattern then everytime user inputs same data or reads same data, there is I/o data transfer
// hence making the program slower. So By, using Singleton Pattern, We just store the 
// data in method for that session
// and whenever there is requirement for that data, the program does not fetch or read it from
// memory, it directly fetches from that method with the help of Objects , atleast for that session.
// (session is time for which app remains open)

// 2.> LOGGING:: When we are making a huge app, then when the user is interacting with that app
// (pressing buttons, scrolling), then we make log-- like at this moment of time user scrolled.
// In log file , there is basically text file in which all those events are kept)
// If We use Singleton Pattern , then we make method which job is to write those events in logger
// class. So there is stoppage of inconsistency, and unsynchronization as there is no need for
// creating objects everytime for storing those events.

// So basically Singleton Pattern is used where we feel that there is time consuming task.And we
// should save those task somewhere in RAM for faster processing.

/* How to make Singleton Pattern:
 * 1> Private constructor to restrict instantiation of the class from other classes.
 * 2> Private static variable of the same class that is only instance of class
 * 3> Public static method that returns the instance of the class, this is the global access
 *    point for outer world to get the instance of Singleton class
 * 
 */

/* We generally make 'AppConfig' class and one 'MainClass'
* Singleton Pattern says-- One class can have only one object. [i.e we can make only one object
* for AppConfig class in MainClass. To do so we have to private the AppConfig class Constructor.
* Now as we have made it private, So we cannot make any objects. But we have to make 1 object. 
* So in order to do so we will private static variable of AppConfig and make object in MainClass
*/

/* In Short:
 * 1.> Make AppConfig class's constructor PRIVATE
 * 2.> Make one static object in AppConfig Class
 * 		(as we cannot make it in other class as Constructor is PRIVATE)
 * 3.> Make static function which will return that object...thats it:)
 */
public class Singleten_PatternIntro {

	public static void main(String[] args) {
		

	}

}
