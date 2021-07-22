package loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:\n");
		n=sc.nextInt();
		for(int i=n;i>0;i--) {
			f=f*i;
		}
		System.out.println("the factorial is:\t"+f);
		
		
		
	}

}
