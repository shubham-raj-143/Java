package Algorithms.Recursion;
/*
    n=5
    1+2+3+4+5 = 15
    
    Steps:
    1> n = 1 , sum(1) = 1; 
    
    2> sum(4)+5 = sum(5);
    
    3>Generalize : sum(n) = ---> 1       ,      n =1
    					    |
    					    --->n+sum(n-1)
 */
public class SumOfNaturalNum {

	public static void main(String[] args) {
		System.out.println(sum(5));

	}
	static int sum(int n)
	{
		//base case/ termination condition
		if(n == 1)
		{
			return 1;
		}
		//recursive call
		return n+sum(n-1);
	}

}
