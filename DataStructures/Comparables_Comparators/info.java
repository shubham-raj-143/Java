package DataStructures.Comparables_Comparators;
/*
  ------------------------
   Comparable Interface --> this does not provide flexibility in sorting.
  ------------------------
   >> This interface imposes a total ordering on the objects of each class that implements it.
   	  This ordering is referred to as the class's natural ordering, and the class's compareTo 
   	  method is referred to as its natural comparison method.
   	  
   >> List(and arrays) of objects that implements this interface can be sorted automatically by
      Colllections.sort(and Arrays.sort)
      
   >> Objects that implement this interface can be used as keys in a sorted map or as elements
      in an a sorted set, without the need to specify the comparator.
      
    public interface Comparable<T>
     {
    	public int compareTo(To);
     }
*/
/* ---------------------------
    COMPARATOR INTERFACE
    -------------------------
    >> A comparison function, which imposes a total ordering on some collection of objects
    
    >> Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to 
    allow precise control over the sort order.
    
    >> Comparators can also be used to control the order of certain data structures(such as
    sorted sets or sorted maps), or to provide an ordering for collections of objects that don't
    have a natural ordering.
    
    public interface Comparator<T>
    {
    	int compare(T obj1, T obj2);
    }
 */
public class info {

	public static void main(String[] args) {
		

	}

}
