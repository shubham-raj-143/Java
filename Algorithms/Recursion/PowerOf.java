package Algorithms.Recursion;
/*  
    a^b
    3^4 = 3x3x3x3
    
    1> if b = 0, 3^0 = 1
    			a^0 = 1
    			
    2> 3^3 x 3 = 3^4
    
    3> pow(a, b) = 1             ,     b=0
    			 = a x pow(a, b-1)
    
 */
public class PowerOf {
	
	static int stepCount1 = 0, stepCount2 = 0;
	
	
	public static void main(String[] args) {
		System.out.println(pow1(3, 100));
		System.out.println("Steps : "+stepCount1);
		
		System.out.println(fastpow(3, 100));
		System.out.println("Steps : "+stepCount2);

	}
	static int pow1(int a, int b)
	{
		stepCount1++;
		if(b == 0)
		{
			return 1;
		}
		return a*pow1(a, b-1);
	}
	
	// Solve in logN times
	/*
	     fastpow(a, b) = 1                  , b=0
	     			   = fastpow(a^2, b/2)  , b->even
	     			   = a*fastpow(a, b-1)  , b->odd
	 */
	static int fastpow(int a, int b)
	{
		System.out.println(b);
		stepCount2 +=1;
		if(b == 0)
		{
			return 1;
		}
		if(b%2 == 0)
		{
			return fastpow(a*a, b/2);
		}
		return a*fastpow(a, b-1);
	}
	

}
