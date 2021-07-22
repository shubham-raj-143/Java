package DataStructures.SetsPower;
//HASHSET : We don't know the order of elements inserted. But at time of removal shortest will get removed. Implements HashMap
//			PROS: Has Constant Time Complexity

// LinkedHashSet : Insertion Ordering keeps same as that of Insertion. Otherwise all functions are same as HashSet. Implements LinkedList
//				CONS: Does not have constant time property. It has Linear Time.

// TreeSet : No bother how we enter the elements, It will be printed in Sorted Order. So if we want elements to print in sorted form and still
//			 maintain property of set(no duplicate & at time of deletion smallest will be removed ), then we can use this.
// 			 TreeSet implements TreeMap.
//			 TimeComplexity : log n
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// HashSet
		Set<String> fruits = new HashSet<>();
		
		//add function returns booleans--> true when no duplicate is present and false when duplicate of element is already present.
		
		fruits.add("Apple");
		
		System.out.println(fruits.add("Banana"));
		fruits.add("Mango");
		
		System.out.println(fruits.add("Apple"));    // No duplicate allowed--neglected
		
		System.out.println(fruits);   // will not print in same order as inserted
		
		//LinkedHashSet
		Set<Integer> number = new LinkedHashSet<>();
		number.add(12);
		number.add(13);
		number.add(10);
		number.add(6);
		System.out.println(number);  // will print in same order
		
		//TreeSet
		Set<Integer> num = new TreeSet<>();
		num.add(12);
		num.add(13);
		num.add(10);
		num.add(6);
		System.out.println(num);
		
		
		

	}

}
