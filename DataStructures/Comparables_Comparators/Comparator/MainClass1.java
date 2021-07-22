package DataStructures.Comparables_Comparators.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import DataStructures.Comparables_Comparators.Comparable.Student;

public class MainClass1 {

	public static void main(String[] args) {
		List<Student1> students = new ArrayList<>();
		
		students.add(new Student1(23, "Shubham"));
		students.add(new Student1(23, "Shubhra"));
		students.add(new Student1(12, "Kuldeep"));
		students.add(new Student1(34, "Kuldeep"));
		students.add(new Student1(54, "Anushka"));
		students.add(new Student1(21, "Anjali"));
		
//		Collections.sort(students, new Comparator<Student1>() {
//
//			@Override
//			public int compare(Student1 o1, Student1 o2) {
//				if(o1.name.equals(o2.name))
//				{
//					return o1.marks - o2.marks;
//				}
//				else
//				{
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			
//		});
		
		
//		// By Lambda function  ->
//		Collections.sort(students,  ( o1,  o2)-> {
//				if(o1.name.equals(o2.name))
//				{
//					return o1.marks - o2.marks;
//				}
//				else
//				{
//					return o1.name.compareTo(o2.name);
//				}
//			});
	
	
//		// Only Sort by name
//		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
		
		
		// Sort by name then marks in reversed order.
		Collections.sort(students, Comparator.comparing(Student1::getName)
				.thenComparing(Student1::getMarks).reversed());
		
		students.forEach(System.out::println);

	}
	

}
//class sortByNameThenMarks implements Comparator<Student1>
//{
//	@Override
//	public int compare(Student1 o1, Student1 o2) {
//		if(o1.name.equals(o2.name))
//		{
//			return o1.marks - o2.marks;
//		}
//		else
//		{
//			return o1.name.compareTo(o2.name);
//		}
//	}

	
	
//}
