package DataStructures.ArrayList_Generics;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		
		System.out.println(fruits);
		
		
		//Pair class is Generic Class Now
		Pair<String, Integer> p1 = new Pair<>("Shubham", 123);
		Pair<Boolean, String> p2 = new Pair<>(true, "How are you?");
		
		p1.getDescription();
		p2.getDescription();
	}
	

}
