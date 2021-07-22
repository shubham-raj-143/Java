package DataStructures.LinkedList.VectorStack.stack;
import java.util.Stack;
public class MainClass {
	
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
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
