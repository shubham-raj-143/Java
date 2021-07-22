package DataStructures.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("three", 5);
		
		numbers.putIfAbsent("one", 10);
		
		System.out.println(numbers.containsValue(1));
		System.out.println(numbers.keySet());
		System.out.println(numbers.entrySet());
		System.out.println(numbers.values());
		
		//traversing
		
		
//		for(Entry<String, Integer> entry : numbers.entrySet())
//		{
//			
//		}
		
		Set<Entry<String, Integer>> enteries = numbers.entrySet();
		for(Entry<String, Integer> entry : enteries)
		{
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(numbers);
		

	}

}
