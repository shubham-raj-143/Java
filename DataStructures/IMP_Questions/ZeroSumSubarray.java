package DataStructures.IMP_Questions;
import java.util.*;
/*
 	BASED ON SETS::
 	
 	Given an array, find if there exists a subarray with sum equal to zero.
 	n<10^5
 	
 */
public class ZeroSumSubarray {

	public static void main(String[] args) {
		
		/*-------Time Limit --- n^2
		int[] a = {2, 1, -2, 4, 2};
		boolean found = false;
		for(int i=0;i<a.length;i++)
		{
			int sum = 0;
			for(int j=i;j<a.length;j++)
			{
				sum +=a[j];
				if(sum==0)
				{
					found = true;
					break;
				}
				
			}
			if((found)) break;
			
		}
		System.out.println("found "+found);
		*/
		
		
		// Time Complexity:: O(N).
		//But will take more space for storing sum in set.
		// a[3, 4, -1, 4, 3, -6, 4, 1]
		//	--x--
		//  --------y----------
		//if(y==x) then yes it contains zero sum set-- -1 4 3 -6
		
		//Now Q is can you find sum of set whose value is equal to k...Yes
		// let k = 2
		// a[3, 4, -1, 4, 6, -6, 4, 1]
		//	 --x-- ------k-----
		//   --------y----------
		// x-y should be k.
		
		int[] a = {2, -4, -2, 1, 4, 2};
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		int sum =0;
		int k = -5;
		for(int element:a)
		{
			set.add(sum);
			sum += element;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		
		System.out.println("Found : "+ found);
		
		
	}

}
