package DataStructures.PriorityQueues;
import java.util.*;
// Given an array of N positive integers, print K largest elements from the array. The output element should be printed in decreasing order.
public class TopKelemnts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the K value");
		int k = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				pq.add(a[i]);
			}
			else
			{
				if(pq.peek()<a[i])
				{
					pq.poll();  //smallest element will get removed from priority queue
					pq.add(a[i]); // add that element
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>(pq);
		Collections.sort(ans, Collections.reverseOrder());
		System.out.println("Top largest "+k+" elements are:");
		for(int x:ans)
		{
			System.out.print(x+" ");
		}

	}

}
