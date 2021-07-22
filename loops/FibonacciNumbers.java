package loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n,a=0,b=1,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:\n");
		n=sc.nextInt();
		while(i<=n) {
		i=a+b;
		System.out.print(a+" ");
		a=b;
		b=i;
		
		}

	}

}
