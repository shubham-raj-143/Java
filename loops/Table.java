package loops;
import java.util.*;
import java.io.*;


public class Table {


	public static void main(String[] args) {
		
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int p=1,c,s=0;
	            for(int j=0;j<n;j++) {
	            	c=p*b;
	            	 s=s+c;
	            	System.out.print(s+a+" ");
	            	p=p*2;
	            	
	            	
	            	
	            }
	            System.out.println();

	        }
	        

	}

}
