package DataStructures.LinkedList.MyLinkedList;
// This is to show how Linked List works backend.
//Let us make LinkedList which stores Integer. We are not using Generic, if we used so then we would be able to create the Linked List
// of our fav datatype.Ti convert into generic just replace int to E.

import java.util.List;

public class MyLinkedList<E>{
	
	Node<E> head;
	
	//inserting element to end
	public void add(E data)
	{
		Node<E> toAdd = new Node<E>(data);
		//The head of the linked list should not be empty while inserting as while traversing head-> null and we are checking
		//(head.next != null)---will give Null Pointer Exception.
		if(isEmpty())
		{
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = toAdd;
	}
//	//addAll
	void addAll(List<E> list)
	{
		for(E i:list)
		{
			add(i);
		}
	}
	//deleting an element
	void remove(E ele)
	{
		if(isEmpty())
		{
			return;
		}
		if(head.data.equals(ele))
		{
			head = head.next;
			return;
		}
		Node<E> first = null;
		Node<E> second = head;
		while(!(second.data.equals(ele)))
		{
			first = second;
			second = second.next;
		}
		first.next = second.next;
	}
	//removeAll
	void removeAll(List<E> list)
	{
		for(E i:list)
		{
			remove(i);
		}
	}
	//Removing last element
	public E removeLast() throws Exception
	{
		Node<E> temp = head;
		if(temp == null)
		{
			throw new Exception("Cannot remove last element from empty list");
		}
		if(temp.next == null)
		{
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next !=null)
		{
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	//getLast element
	public E getLast() throws Exception
	{
		Node<E> temp = head;
		if(temp == null)
		{
			throw new Exception("Cannot peek last element from empty list");
		}
		
		while(temp.next !=null)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	
	//contains element or not
	boolean contains(E ele)
	{
		Node<E> temp = head;
		while(temp != null)
		{
			if((temp.data).equals(ele))
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	// print LL
	void print()
	{
		Node<E> temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	
	//Check for empty List
	public boolean isEmpty()
	{
		return head == null;
	}
	
	
	//We make static class so that the class could be referenced even outside the class also.
	public static class Node<E>
	{
		public E data;
		public Node<E> next;
		
		public Node(E data)  //Constructor
		{
			this.data = data;
			next = null;
		}
	}
	
}
