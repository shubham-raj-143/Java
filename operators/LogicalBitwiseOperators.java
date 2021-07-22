package operators;

public class LogicalBitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=55;
		if(a>1 && a<100) {                                   //Logical AND && operator does not check both conditions ....if first condition is false 
															//then it will not even check the second condition and give the result as 0 (false)
			System.out.println("Number lies between 1 and 100");
		}
		else {
			System.out.println("Number do not lie in range 1 and 100");
		}
		if(a>1 & a<100) {                                   //Bitwise AND & operator checks both conditions ....if first condition is false 
			                                               //then it will  even check the second condition and give the result as according
			System.out.println("Number lies between 1 and 100");
		}
		else {
			System.out.println("Number do not lie in range 1 and 100");
		}

	}

}
