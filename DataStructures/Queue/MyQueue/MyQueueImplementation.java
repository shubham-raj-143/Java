package DataStructures.Queue.MyQueue;

public class MyQueueImplementation {

	public static void main(String[] args) {
		MyQueue<Integer> mq = new MyQueue<>();
		mq.enqueue(12);
		mq.enqueue(13);
		mq.enqueue(14);
		mq.enqueue(15);
		mq.enqueue(16);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(17);
		System.out.println(mq.dequeue());

	}

}
