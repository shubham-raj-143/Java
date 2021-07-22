package DataStructures.LinkedList.MyLinkedList;

import java.util.*;

public class MyLinkedListImplementation {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		MyLinkedList<Integer> myLL2 = new MyLinkedList<>();
		for(int i=0;i<=9;i++)
		{
			myLL.add(i+"add");
			myLL2.add(i);
		}
		
		myLL.print();
		myLL.remove(5+"add");
		myLL.print();
		
		myLL2.print();
		myLL2.remove(0);
		myLL2.print();
		
		System.out.println(myLL2.contains(3)?"Yes 3 Present":"No 3 is not present");
		List <Integer> list = new ArrayList<>();
		list.add(100);
		list.add(102);
		list.add(103);
		list.add(104);
		myLL2.addAll(list);
		myLL2.print();
		myLL2.removeAll(list);
		myLL2.print();
		
		
		
	}

}
