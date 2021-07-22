package Algorithms.Recursion;
/*
    --> Find all paths in a (n x m) grid to reach the end point.
    --> condition is that we can move only right and down.
    
    1> consider we have 1 row and 1 column then we have 1 path.
       when n=1 , m=3 then too we have 1 path.
       when n=3 , m=1 then also we have 1 path.
       
    2> League Of Faith :: at last we have to go in 3x4(last row) or 4x3last column) condition then 
       we will have 1 path and we will reach end.
 */
public class findPathInGridNxN {

	public static void main(String[] args) {
		System.out.println(path(3, 4));

	}
	
	static int path(int n, int m)
	{
		if(n == 1 || m == 1)
		{
			return 1;
		}
		return path(n, m-1) + path(m, n-1);
	}

}
