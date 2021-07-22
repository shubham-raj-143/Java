package oops.Abstraction.UsingInterfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		Person obj = new Person();
		//Now Person has both behaviors---make Video as well as study.
		obj.study();
		obj.makeVideo();
		
		// Upcasting;;; as Person is also a Youtuber::::::: We cannot instantiate but can upcast
		// Youtuber obj2 = new Youtuber();  WRONG
		Youtuber obj2 = obj;
		// Now obj2 can only work with Youtuber methods
		obj2.editVideo();
		obj2.makeVideo();
		// obj2.study();           WRONG
		
	}

	@Override
	public void study() {
		System.out.println("The person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making Youtube video");
		
		
	}

	@Override
	public void editVideo() {
		System.out.println("Youtuber is editing");
		
	}
	

}
