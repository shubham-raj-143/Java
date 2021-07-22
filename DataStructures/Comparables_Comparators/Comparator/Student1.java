package DataStructures.Comparables_Comparators.Comparator;


public class Student1{
	int marks;
	String name;
	public Student1(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Student1 obj)
	{
		
		
		return this.marks-obj.marks;
	}
	
	
}
