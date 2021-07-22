package array;
import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		int s=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subjects:\n");
		int n=sc.nextInt();
		int m[]=new int[n];
		System.out.println("Enter marks:\n");
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
			s=s+m[i];
		}
		a=s/n;
		System.out.println("Average of the marks: "+a);

	}

}
