package threads;
/*
THREAD GROUP: >> Java provides a convenient way to group multiple threads in a single object. 
			>> In such way, we can suspend, resume or interrupt group of threads by a single method call.
			
			>> Java thread group is implemented by java.lang.ThreadGroup class
			>> A ThreadGroup represents a set of threads. A thread group can also include the other thread group.
			>> The thread group creates a tree in which every thread group except the initial thread group has a parent.
			>> A thread is allowed to access information about its own thread group, but it cannot access the information 
			about its thread group's parent thread group or any other thread groups.
			
			>> There are only 2 constructors of ThreadGroup class:
				1> ThreadGroup(String name)  --> 	creates a thread group with given name.
				2> ThreadGroup(ThreadGroup parent, String name)  --> creates a thread group with given parent group and name.
*/

class ThreadGroupDemo implements Runnable {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadGroupConcept {

	public static void main(String[] args) {
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		
		ThreadGroup tg1 = new ThreadGroup("Parent Thread");
		
		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();
		
		System.out.println("Thread Group Name: "+tg1.getName());
		tg1.list();
		
	}

}
