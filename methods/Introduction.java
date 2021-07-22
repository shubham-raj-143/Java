package methods;
import java.util.*;
import java.io.*;

public class Introduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=34;
		int n2=23;
		int result=maxOf(n1,n2);                  //Calling of methods....
		System.out.println(result);
		sayHi();
		sayHi();                                     // DRY-don't repeat yourself..example ...
		sayHi();
		
	}
	static int maxOf(int a, int b) {            //method creation.....here we have written static keyword as we can call static function for static main function/methods or any other function..
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static void sayHi() {
		System.out.println("Hi,Good to meet You");
		System.out.println("Good Morning");
	}
}


