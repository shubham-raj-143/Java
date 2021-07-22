package loops;

public class PascalsTriangle {

	public static void main(String[] args) {
		int s=1;
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
				
			}
			
				System.out.print(s+" ");
				 
				
			
			s=s*11;
			System.out.println();
			
		}

	}

}
