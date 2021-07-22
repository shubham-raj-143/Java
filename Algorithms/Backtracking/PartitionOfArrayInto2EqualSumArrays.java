package Algorithms.Backtracking;

import java.util.ArrayList;

/*
     a[] = {2, 1, 2, 3, 4, 8}  = 20. [ overall sum of array must be even. ]
     			|
     			|
     			V
     [2, 1, 3, 4] &  [2, 8]    both subarray sum is 10 therefore total 20.
     
     Backtracking:: If the element does not work then change that element
 */

public class PartitionOfArrayInto2EqualSumArrays {

	public static void main(String[] args) {
		int a[] = {2, 1, 2, 3, 4, 8};
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum +=a[i];
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		 //if last bit of number is 1 then odd else even--> sum&1
		boolean isPossible = (sum&1) == 0 && partition(a, sum/2, 0, ans);
		
		if(isPossible)
		{
			for(int e:ans)
			{
				System.out.println(e+" ");
			}
		}
		else
		{
			System.out.println("Not Possible");
		}
		
	}
	static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans)
	{
		if(i>=a.length || sum < 0)
		{
			return false;
		}
		if(sum == 0)
		{
			return true;
		}
		ans.add(a[i]);
		boolean leftPossible = partition(a, sum-a[i], i+1, ans);
		if(leftPossible) return true;
		// This line makes backtracking possible.
		ans.remove(ans.size()-1);
		return partition(a, sum, i+1, ans);        //move right.
	}
	

}
