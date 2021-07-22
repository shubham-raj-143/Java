package array;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rown and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		System.out.println("Enter first matrix elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int s[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				s[i][j]=a[i][j]+b[i][j];
				
			}
		}
		System.out.println("Sum of the array is:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(s[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
		

	}

}
