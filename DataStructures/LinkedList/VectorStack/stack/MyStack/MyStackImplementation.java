package DataStructures.LinkedList.VectorStack.stack.MyStack;

//When to use::::::::In problems such like anyone travels through path and then return back some distance.
//So we will be using stack to do so.. for traveling ahead push and for traveling back pop.

//While Making an android application, we are opening multiple screens then previous ones which are not required gets
//removed in LIFO manner..(top is removed first.
public class MyStackImplementation {
	public static void main(String[] args) throws Exception
	{
		MyStack<Integer> stack = new MyStack<>();
		int pop;
		stack.push(12);
		stack.push(24);
		stack.push(36);
		pop = stack.pop();
		System.out.println(pop);
		int peeked = stack.peek();
		System.out.println(peeked);
		pop = stack.pop();
		System.out.println(pop);
	}
}
