package threads;

class MyThreadRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am a thread 1 not a threat 1");
		}
	}

}

class MyThreadRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am a thread 2 not a threat 2");
		}

	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		MyThreadRunnable bullet1 = new MyThreadRunnable();
		Thread gun1 = new Thread(bullet1);
		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();

	}

}
