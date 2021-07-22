package DataStructures.Comparables_Comparators.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Shubham"));
		students.add(new Student(23, "Shubhra"));
		students.add(new Student(12, "Rajdeep"));
		students.add(new Student(34, "Kuldeep"));
		students.add(new Student(54, "Anushka"));
		students.add(new Student(21, "Anjali"));
		
		Collections.sort(students);
		
		students.forEach(System.out::println);

	}

}
