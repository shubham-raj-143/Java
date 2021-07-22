package oops.encapsulations;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>20) {
			System.out.println("You are too old to be a student in a school");
		}
		else {
			this.age = age;
		}
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>10) {
			System.out.println("Your name is too long \n Must be between 3 and 10");
		}
		else if(name.length()<3) {
			System.out.println("Your name is too short \n Must be between 3 and 10");
		}
		else {
			this.name = name;
		}

		
	}
	
		
}
