package DataStructures.PriorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Guava");
		pq.add("Apple");
		pq.add("Pineapple");
		pq.add("Banana");
		pq.add("Mango");
		pq.add("Orange");
		
		//When we print the elements in PQ then it is may or may not be in sorted but at time of removal, the deleted element is always 
		//removed in sorted form
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		

	}

}
