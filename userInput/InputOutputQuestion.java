package userInput;
//in progress***
import java.util.Scanner;

public class InputOutputQuestion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	int c=0;
            String s1=sc.next();
            int x=sc.nextInt();
            int l1=s1.length();
            System.out.print(s1);
            
            int s=15-l1;
            while(s>0) {
            	System.out.print(" ");
            	s--;
            }
            int p=x;
            while(x>0) {
            	c++;
            	x=x/10;
            }
            int l=3-c;
            if(p!=0) {
            while(l>0) {
            	System.out.print("0");
            	l--;
            }
            }
            else {
            	System.out.print("00");
            }
            
           
            System.out.println(p);
            
            
        }
        System.out.println("================================");
		
	}

}
