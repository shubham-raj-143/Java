package loops;

import java.util.Scanner;

public class PowerOf {
	public static void main(String[] args) {
		int a,b,s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number then power:\n");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=b;i++) {
			s=s*a;
			
		}
		System.out.println(s);
	}

}
