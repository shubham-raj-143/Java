package DataStructures.ArrayList_Generics;
// Creating Generic Class -- here we can make of two datatypes which we don't know now. we will know after entering values.
//Same as ArrayList<> provide generic for Integer, float, String etc....Here we make Generic class for Pair of types.
public class Pair<X, Y> {
	X x;
	Y y;
	
	public Pair(X x, Y y)
	{
		this.x = x;
		this.y = y;
	}
	public void getDescription()
	{
		System.out.println(x+" & "+y);
	}
}
