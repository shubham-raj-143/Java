package threads;


class MyThr extends Thread{
	public MyThr(String name) {
		// as Thread class already has a constructor which takes name as parameter. and here we have created our own constructor MyThr with parameter name
		super(name); 
	}
	
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("I am a thread");
			i++;
		}
	}
}

// By Runnable interface
class MyRunThr implements Runnable{

	public void run() {
		System.out.println("Hello Binod!!");
	}
}
public class ThreadConstructor {

	public static void main(String[] args) {
//		MyThr t1 = new MyThr("Shubham");
//		MyThr t2 = new MyThr("Shubhra");
//		t1.start();
//		System.out.println("The Id of thread t1 is: "+t1.getId());
//		System.out.println("The name of thread t1 is: "+t1.getName());
//		
//		System.out.println("The Id of thread t2 is: "+t2.getId());
//		System.out.println("The name of thread t2 is: "+t2.getName());
		
		MyRunThr t1 = new MyRunThr();
		Thread r1 = new Thread(t1, "Shubham");
		
		r1.start();
		System.out.println("The Id of thread r1 is: "+r1.getId());
		System.out.println("The name of thread r1 is: "+r1.getName());

	}

}
