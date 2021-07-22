package DataStructures.LinkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		System.out.println(ll.get(1));
//		ll.toArray();
//		System.out.println(ll);
		List<Integer> al  = new ArrayList<>();
		getTimeDiff(al);
		getTimeDiff(ll);


	}
	static void getTimeDiff(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		for(int i = 0; i<100000;i++)
		{
			list.add(0, i); // add element i always in 0th index, others will get shifted to right in case of ArrayList.But in case of
							// Linked List just points the references of i to head node, and head becomes that new node inserted.
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" --> "+ (end-start)); //Linked List is way faster while inserting in particular
																			//index.
	}

}
