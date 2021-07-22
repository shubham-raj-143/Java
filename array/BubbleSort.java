package array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,5,4,3,2,1,5,6,3};
		int t=0;
		boolean sorted=false;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[j];
					a[j]=a[i];
					a[i]=t;
					sorted=false;
				}
			}
			if(sorted) {
				break;
			}
		}
			for(int i=0;i<a.length;i++) {                    
				/*
					for(int item:a) {
					System.out.print(item+" ");
					}   
				*/
				
			
				System.out.print(a[i]+" ");
			}
		

	}

}
