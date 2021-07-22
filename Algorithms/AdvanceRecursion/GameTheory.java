package Algorithms.AdvanceRecursion;
/*
   1> base condition-> 2 coins then maximum of two will be my answer.
   
 ind->  0 1 2 3 4 5
 ele->  1 5 7 3 2 4
 
 lets consider smaller problem -> index(0, 3)---> explained in SVG whiteboard in this folder
 
   
   
 */
public class GameTheory {
	
	public static void main(String[] args)
	{
		int a[] = {1, 5, 700, 3};
		System.out.println(coinMax(a, 0, a.length-1));
		
	}
	static int coinMax(int a[], int l, int r)
	{
		if(l+1 == r)   // there are 2 coins left
		{
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+ Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)), 
				a[r]+Math.min(coinMax(a, l+1, r-1), coinMax(a, l, r-2)));
	}

}
