//Encapsulation: Process of wrapping code and data together into single unit
// The piece of code which works together then keep them together, to make our code neater and easy to maintain

// why encapsulation :
/* 1. helps us to keep realted fields and methods together, which makes our code cleaner and easy to read
 * 2. control modification of data fields.
 * 3. helps to decouple components of system. These decoupled components can be developed, debugged and tested
 *  	independently and countinuously. And any changes to particular component do not have effect on other 
 *  	components.
 */
// How to achieve ENCAPSULATION:
// 1.> Declare the variables of a class as private
// 2.> Provide public setter and getter method that will be used to write and read these variables values
// 3.> thats it

package oops.encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {

		Student obj = new Student();
		obj.setAge(13);
		System.out.println(obj.getAge()); // So we have restricted age and name (like age cannot be greater than 18 etc)
											// . So that user may not enter malInputs.
		obj.setName("Shubham Raj Singh");
		System.out.println(obj.getName());
	}

}

// Same thing is there in android development: we are supposed to cut off dependency of one class from other class. (or they must be very much less dependable)
// So that if in future a code malfunctions then we may know that it was due to that particular class and if we fix that class we can solve bugs.
// The whole concept of android development is based upon , to limit the transaction of one class to other, and iF there is transaction then use 
// GETTER AND SETTER METHOD to do so... get any data from one class and set it with restricted form.... and then will not have any relaton with that class.
