package conditionalStatements;
import java.util.*;

public class IfClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age\n");
		int age=sc.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to Vote");
		}
	}

}
