package DataStructures.HashMap;
import java.util.*;
/*
  	Internal Working Of HashMap:
  --------------------------------
  >> HashMap uses an array table to store its key value pairs.Each element of the array
     holds the head of a linkedlist to avoid collision. The hash of every key is calculated
     and the elements are placed in the array using this hash function.
     
  >> The default capacity is kept at 16 and the load factor at 0.75.
  
  >> Load factor -> After 75% of the 16 index is filled then the hashMap doubles its 
  	 capacity.It becomes 32, and hence again rehashing of all elements takes place 
  	 as per then Modulo will be taken 32.
  	 
  >> Hence, lookup time/Time Complexity is reduced by reaching load factor.
  
  
  >>		HASH MAP INTERNAL WORKING
  			
  
table[]                 LinkedList
-------   ------------------------------------
  0[]---->[null | value | null]
  1[]
  2[]
  3[]---->[key1 | value1 | null]     }-> Entry<k,v> object
  4[]
  5[]
  6[]
  7[]---->[key2 | value2 | --]---->[ key3 | value3 | null]
  8[]
  9[]
 10[]
 11[]---->[key4 | value4 | --]---->[key5 | value5| null]
 12[]
 13[]
 14[]
 15[]
  
 */
public class InteriorWork1 {

	public static void main(String[] args) {
		
		System.out.println(getHash("CAT"));

	}
	public static int getHash(String s)
	{
		int hash = 0;
		for(int i = 0;i<s.length();i++)
		{
			hash += s.charAt(i);
		}
		return hash;
	}

}
