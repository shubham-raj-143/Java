package DataStructures.ArrayDeque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(13);
		
		ad.pop();
		System.out.println(ad.peek());
		ad.push(14);
		ad.push(15);
		ad.push(16);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
		

	}

}
