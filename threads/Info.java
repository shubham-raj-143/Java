package threads;

/*
    Multiprocessing and multithreading both are used to achieve multitasking
    
 */

/* Parameters vs Arguments:
   Parameters are the values written in function
   Arguments are the actual values.
   
   void sum(int a, int b);   parameters
   sum(3, 5); arguments are actual
 */

/*   Concurrency vs Parallelism:
     CONCURRENCY: It is the task of running and managing the multiple occupations at the same time.(We are not doing multiple tasks at same time but we are managing
     				them at the same time. like we are cooking food simultaneously i m reading the book. So I can leave cooking after placing the rice in cooker and
     				chat, but when rice is cooked we have to leave chatting and remove it from gas. Here we are managing)
     PARALLELISM: It is the task of running multiple computations simultaneously.
 */


class MyThread extends Thread {
	@Override
	public void run() {
		int i=1;
		while (i<40000) {
			System.out.println("My thread is running");
			System.out.println("I am Happy");
			i++;
		}

	}
}
class MyThread2 extends Thread {
	@Override
	public void run() {
		int i=1;
		while (i<40000) {
			System.out.println("My thread2 is good");
			System.out.println("I am sad");
			i++;
		}

	}
}

public class Info {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}
}
