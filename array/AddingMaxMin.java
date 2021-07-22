package array;

import java.util.*;

// to print sum of all lowest 4 digits and highest 4 digits
public class AddingMaxMin {

	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];

        for(int i=0;i<5;i++){
             n[i]=sc.nextInt();

        }
        int min=n[0];
        long s1=0,s2=0;
        int t=0;
        for(int i=0;i<4;i++){
        	
           for(int j=i+1;j<5;j++){
        	   if(n[i]>n[j]) {
        		   t=n[i];
        		   n[i]=n[j];
        		   n[j]=t;
        	   }
           }
           
        
       
        	
        
        }
        for(int i=0;i<5;i++) {
        	System.out.println(n[i]);
        	
        }
        for(int i=0;i<4;i++) {
        	s1=s1+n[i];
        	
        }
        System.out.print(s1+" ");
        for(int i=1;i<5;i++) {
        	s2=s2+n[i];
        	
        }
        System.out.println(s2);
        
        
        


    }

}
