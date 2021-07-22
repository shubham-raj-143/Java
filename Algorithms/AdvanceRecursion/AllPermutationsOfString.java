package Algorithms.AdvanceRecursion;

import java.util.HashSet;
import java.util.Set;

/*
    --> Print all Permutations of given String
    	 
    	 eg-> abc
    	      acb
    	      
    	      bac
    	      bca
    	      
    	      cab
    	      cba
    	      
      --> in each step we are fixing one character and Playing same with other remaining characters.
      --> till one character is left in string.
    	 	  
 */
public class AllPermutationsOfString {

	// after applying sets we can print all unique strings.
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		allPermutationString("abcc", 0, 2);

	}
	static void allPermutationString(String s, int l, int r)
	{
		//basic condition
		if(l == r)
		{
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s = interchangeChar(s, l, i);
			
			//recursion
			allPermutationString(s, l+1, r);
			
			// backtracking->we want our string in old form
			s = interchangeChar(s, l, i);
		}
		
		
		
	}
	static String interchangeChar(String s, int a, int b)
	{
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}

}
