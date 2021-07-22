package DataStructures.HashMap;

import java.util.HashSet;
import java.util.Set;

/*
 	hashCode() and equals() methods :
 	__________________________________
 	
>>hashCode() and equals() methods have been defined in "Object" class which is parent class
 	for java objects. For this reason, all java objects inherit a default implementation of
 	these methods.
 	
>>	Java hashCode()                    |        Java equals()
  _____________________________________|_____________________________________________
	1>Object class defined hashCode()  | 1> Object class defined equals() method like this:
	  method like this:				   |    
	  								   |
	  public int hashCode()			   |	public boolean equals(Object obj)
	  {                                |		{
	  // TODO return hashCode;         |				return (this == obj);
	  }								   |		}
								 
 */

/*
  >>By hashCode we will be able to know which location will the value come. and equals will compare
    one value with other inside that location.
    Hence we should make hashCode and equals together.
    
  >>At first when we defined equals and not hashCode then for every objects the hashCode was
    different(because they were in different memory). Thats why in HashSet there was two separate
    Object added.
    
  >>But we know that if two pens are same(color and price) then their hashCode must also be same.
    So we defined hashCode which then returns same location in integer value.
 */

/* -----------------
     CONTRACT
   -----------------
   The contract between equals() and hashCode() is:
   1> The two objects are equal, then they must have same hashCode.
   2> If two objects have the same hashCode, they may or may not be equal. 
   
 */

/*
    HashCodes are used for to narrow up the results for searching.
 */

/*
      BEST PRACTICES
   ------------------------
   1>Always use same attributes of an object to generate hashCode() and equals()both. 
   
   2>equals() must be consistent (if the objects are not modified then it must keep returning 
   		the same value).
   		
   3>Whenever a.equals(b), then a.hashCode() must the same as b.hashCode(). 
   
   4>If you override one, then you should override the other.
 */
public class HaashCode_Equals {

	public static void main(String[] args) {
		Pen pen1 = new Pen(10, "blue");
		Pen pen2 = new Pen(10, "blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		System.out.println(pen1 == pen2);   // false
		System.out.println(pen1.equals(pen2));   // true
		
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		
		System.out.println(pens);
		

	}

}

class Pen
{
	int price;
	String color;
	
	public Pen(int price, String color)
	{
		this.price = price;
		this.color = color;
	}
//	@Override
//	public boolean equals(Object obj)   // this might return null pointer exception when we pass
//										// null object or pass object of any other class.
//										// So to avoid this eclipse gives us the implementation:::
//	{
//		Pen that = (Pen) obj;
//		boolean isEqual = this.price ==that.price && this.color.endsWith(that.color);
//		
//		return isEqual;
//	}
//	
//	// before defining hashCode the Set will add two different objects but after defining Only one
//	// Object will be added in Set.
//	@Override
//	public int hashCode()
//	{
//		return price+color.hashCode();
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
