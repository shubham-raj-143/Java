package DataStructures.Queue;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.element());
		

	}

}
