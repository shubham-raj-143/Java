package DataStructures.Comparables_Comparators.Comparable;

public class Student implements Comparable<Student>{
		int marks;
		String name;
		public Student(int marks, String name) {
			super();
			this.marks = marks;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [marks=" + marks + ", name=" + name + "]";
		}
		
		// Getter Methods for accessing private data.
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
		
		// Sorts the Set According to marks and if marks are same then sort a/c to name.
		@Override
		public int compareTo(Student obj)
		{
			if(this.marks > obj.marks)
			{
				return -1;
			}
			else if(this.marks < obj.marks)
			{
				return 1;
			}
			
			return this.name.compareTo(obj.name);
		}
		
}
