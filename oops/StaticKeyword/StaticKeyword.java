package oops.StaticKeyword;

import oops.StaticKeyword.A.B;
import oops.StaticKeyword.A.C;

/*Static Keyword is related to class
 * The keyword static indicates that the particular member[nested class, fields, methods]
 *  belongs to a type itself, rather than to an instance of that type.
 *  
 *  It is mainly used to help memory management.
 * 
 * The Keyword can be applied to variables, methods, blocks and nested class.
 */
public class StaticKeyword {

	public static void main(String[] args) {
		A objA = new A();
		B objB = objA.new B();   //Class B is closely packed with A(Jab tak A nhi banaoge B nhi banega) 
		
		C objC = new A.C();     // Class C is static, hence it is not closely packed, 
								//So we can create it without creating obj of class A
	}

}
