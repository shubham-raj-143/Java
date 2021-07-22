package loops;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  Number:\n");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				c++;
			}		
			
		}
		if(c>0 || n==1) {
		System.out.println("Not a Prime Number");
		}
		else {
			System.out.println(" Prime number");
		}
		
		
		
		

	}

}
