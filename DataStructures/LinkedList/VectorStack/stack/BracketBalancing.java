package DataStructures.LinkedList.VectorStack.stack;

import java.util.Scanner;

import DataStructures.LinkedList.VectorStack.stack.MyStack.MyStack;

public class BracketBalancing{
	//{({})} ---valid
	//{[(})}] --not valid
	public static void main(String[] args) throws Exception{
		String s;
		MyStack <Character> stack = new MyStack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the braces");
		s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')')
			{
				if(stack.isEmpty())
				{
					System.out.println("The Brackets are not balanced!!");
					return;
				}
				if(match(stack.peek(), s.charAt(i)))
				{
					stack.pop();
				}
				else
				{
					System.out.println("The Brackets are not balanced!!");
					return;
				}
				
			}
			
			
		}
		if(stack.isEmpty())
		{
			System.out.println("The brackets are balanced");
		}
		else
		{
			System.out.println("The Brackets are not balanced!!");
		}
		
	}

	private static boolean match(char c1, char c2) {
		if(c1 == '(' && c2 == ')')
		{
			return true;
		}
		if(c1 == '{' && c2 == '}')
		{
			return true;
		}
		if(c1 == '[' && c2 == ']')
		{
			return true;
		}
		return false;
	}
	

}
