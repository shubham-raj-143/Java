package threads;
// WHICH THREAD GETS EXECUTED IS HIGHLY DEPENDENT ON THE OS!
class MyThr1 extends Thread {
	public MyThr1(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(i<50)
		{
			System.out.println("Hello Peter! "+ this.getName());
			i++;
		}
	}
}

public class ThreadPriorities {

	public static void main(String[] args) {
		// Ready Queue: T1 T2 T3 T4 T5 -> all these 5 threads are ready to run by JVM,
		// ThreadSchedular is a component in JVM which maintains this.
		
		MyThr1 t1 = new MyThr1("Shubham");
		MyThr1 t2 = new MyThr1("Raj");
		MyThr1 t3 = new MyThr1("Singh");
		MyThr1 t4 = new MyThr1("Shubhra (most important)");
		MyThr1 t5 = new MyThr1("Pandey");
		
		t4.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
