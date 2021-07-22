package DataStructures.IMP_Questions;
import java.util.*;

/*
 >>	Given an array nums, there is a sliding window of size k moving from the very left of the array to the very right.You can only see the
 		k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.
 	
 >>	Input : nums = [1, 3, -1, -3, 5, 3, 6, 7], and k = 3
 	  Output : [3, 3, 5, 5, 6, 7]
 	
 >>	Explanation:
 	Window Position                              Max
 	------------------                   -------------------
 	[1 3 -1] -3 5 3 6 7							3
 	
 	1 [3 -1 -3] 5 3 6 7							3
 	
 	1 3 [-1 -3 5] 3 6 7							5
 	
 	1 3 -1 [-3 5 3] 6 7							5
 	
 	1 3 -1 -3 [5 3 6] 7							6
 	
 	1 3 -1 -3 5 [3 6 7]							7
 	
 >>	by Using PRIORITY QUEUE DATASTRUCTURE(n.logK)
 	
 >>	Can You solve it in Linear Time?----> Yes, By Using Doubly Ended Queue. Time Complexity: O(n)
 	
 */

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int a[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
		int ans[] = solution.maxSlidingWindow(a, 4);
		for (int i : ans) {
			System.out.print(i+" ");
		}
		

	}
	static class Solution 
	{
		public int[] maxSlidingWindow(int[] a, int k)
		{
			int n = a.length;
			if(n<=1)
			{
				return a;
			}
			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int[n-k+1];
			int i = 0;
			for(;i<k;i++)
			{
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
				{
					dq.removeLast();
				}
				dq.addLast(i);
			}
			for(;i<n;i++)
			{
				ans[i-k] = a[dq.peekFirst()];
				
				while(!dq.isEmpty() && dq.peekFirst() <= i-k)
				{
					dq.removeFirst();
				}
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
				{
					dq.removeLast();
				}
				dq.addLast(i);
			}
			
			ans[i-k] = a[dq.peekFirst()];
			
			return ans;
		}
	}

}
