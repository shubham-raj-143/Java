package oops.Packages;

import java.util.*;

import oops.Packages.models.*;
//import oops.Packages.models.Student;
//import oops.Packages.models.Teacher;

public class MainClass {

	public static void main(String[] args) {
		Student obj = new Student("Tom");
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
		
//		obj.getPassword();   will throw error as private
		obj.name = "Shubham";

	}

}
