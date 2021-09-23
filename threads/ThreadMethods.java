package threads;

class MyNewThr1 extends Thread {
	
	public void run() {
		int i=0;
		while(i<50)
		{
			System.out.println("Joined!");
			i++;
		}
	}
}

class MyNewThr2 extends Thread {
	
	public void run() {
		int i=0;
		while(i<50)
		{
			System.out.println("Finished!");
			try {
				Thread.sleep(455);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		t1.start();
		
		
		// after completion of t1 join others. It can throw an exception like when we are waiting for t1 to join after running .join method
		//then it might happen that t1 was killed before. It may cause Interrupted error.
//		try {
//			t1.join();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		  
		t2.start();

	}

}
