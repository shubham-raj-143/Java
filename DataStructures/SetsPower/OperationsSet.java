package DataStructures.SetsPower;
import java.util.*;
/*
	1> UNION : to get union of two sets x and y, we can use x.addAll(y);
	2> INTERSECTION : to get intersection of two sets x and y, we can use x.retainAll(y)
	3> Subset : to check if x is a subset of y, we can use y.containsAll(x)
 */


public class OperationsSet {

	public static void main(String[] args) {
		Set<Integer> x = new HashSet<>();
		x.add(11);
		x.add(10);
		x.add(12);
		x.add(7);
		
		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(12);
		y.add(6);
		y.add(7);
		
//		x.addAll(y);
//		System.out.println(x);
		
//		x.retainAll(y);
//		System.out.println(x);
		
		System.out.println(x.containsAll(y));
		
		

	}

}
