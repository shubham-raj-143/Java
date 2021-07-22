package DataStructures.LinkedList.VectorStack.stack.MyStack;

//We will be using our own custom LinkedList we created for our custom stack
import DataStructures.LinkedList.MyLinkedList.MyLinkedList;

//push, pop, peek operations
public class MyStack<E> {
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	public void push(E e)
	{
		ll.add(e);
	}
	public E pop() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("popping from empty stack is not allowed");
		}
		return ll.removeLast();
		
	}
	public E peek() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("Peeking from empty stack is not allowed");
		}
		return ll.getLast();
	}
	public boolean isEmpty()
	{
		return ll.isEmpty();
	}

}
