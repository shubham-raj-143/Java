package threads.practice_set;

class Practice1 extends Thread
{
	public void run() {
		int i=0;
		while(i<5)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Goodmorning!");
		i++;
		}
	}
}

class Practice2 extends Thread
{
	public void run() {
		int i=0;
		while(i<5)
		{
		System.out.println("Thankyou!");
		i++;
		}
	}
}

public class Example1 {

	public static void main(String[] args) {
		Practice1 p1 = new Practice1();
		Practice2 p2 = new Practice2();
		
		p1.setPriority(6);
		p2.setPriority(9);
		
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p1.getState());
		
		p1.start();
		System.out.println(p1.getState());
		p2.start();
		
		System.out.println(Thread.currentThread().getState());

	}

}
