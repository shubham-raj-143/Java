package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
		int principal=sc.nextInt();
		sc.nextLine();                     //if you are inputting string value after any other datatype inputs
		                                   //then sc.nextLine(); line should be written otherwise error will occur...
		String s=sc.nextLine();
		float rate=sc.nextFloat();
		
		System.out.println(s);
		System.out.println(principal);
		System.out.println(rate);

	}

}
