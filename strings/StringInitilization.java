package strings;
//strings are immutable...(not replaceable or not changeable)!!!
public class StringInitilization {

	public static void main(String[] args) {
		String name="Shubham";
		name="Kumar";           //here Shubham also remains in the memory and kumar does not replace it...Shubham is shifted to another location.
								//...hence STRINGS ARE IMMUTABLE..
		
		
		String animal=new String("Dog");  /*when we initialize string by new keyword,then no. of copy of string "Dog"
											made is 2 if "Dog"is not present in String Pool area i.e, one in Heap area and other in String
											pool area ....and 1 if "Dog" is present in String pool area from first .*/
		
		String animal2="Cat";
		String animal3="Cat";             /*if we initialize animal2 then java will search that is there any cat present in String pool area 
											if no then Cat gets placed in that area...now if we initialize animal3 with cat then java will again search 
											for any cat present before ...if yes then it does not make any copy ...it just assigns same value to it.
											
											HENCE , ASSIGNING STRING VARIABLE WITH NEW DEOS NOT FOLLOW OPTIMISATION....SO WE WILL NOT USE IT UNLESS 
											WE HAVE REQUIREMENT OF MAKING ANOTHER OBJECT OF IT...*/
		
		String name1="shubham";
		String name2="shubham";
		String name3=new String("shubham");
		System.out.println(name1==name2);        //returns TRUE; this shows both belongs to same area that is String Pool area..
		System.out.println(name1==name3);        //returns FALSE;this shows that name3 belongs to STring pool area as well as Heap area!!
		System.out.println(name1.equals(name3)); //returns TRUE;equals check the equality of characters in string only...
		System.out.println(name);
		

	}

}
