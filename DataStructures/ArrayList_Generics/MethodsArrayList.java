package DataStructures.ArrayList_Generics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MethodsArrayList {

	public static void main(String[] args) {
		//One is Linked List and other is Array List but they do not bother as both implements List at top level.
		List<String> fruits = new LinkedList<>();
		ArrayList<String> vegetables = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("papaya");
		fruits.add("Apple");
		fruits.add("Hii");
		
		for(String f:fruits)
		{
			System.out.println(f);
		}
		
		vegetables.add("Potato");   //add
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		
		fruits.addAll(vegetables);  //addAll
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(3));  //get
		System.out.println(fruits.set(1, "Banana")); //set
		
		fruits.remove(2); //remove
		
		System.out.println(vegetables);
		vegetables.clear();//clear-- faster than removeAll
		System.out.println(vegetables);
		
		//removeAll
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Mango");
		toRemove.add("Hii");
		fruits.removeAll(toRemove);
		System.out.println(fruits.size()); //size
		
		System.out.println(fruits.contains("Banana"));//contains
		System.out.println(fruits.isEmpty()); //isEmpty
		
		//Converts List to an Array
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);  //toArray()----Converts List to an Array
		for(String e:temp)
		{
			System.out.println(e);
		}
		
		
		System.out.println(fruits);
	}

}
