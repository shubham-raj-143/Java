package Algorithms.Backtracking;
/*
   At a particular point, We will go left , right, top, bottom and then from there if we realize 
   that which is shortest path then we will move that direction only.
 */
public class ShortestPathInMaze {

	public static void main(String[] args) {
		int a[][] = {
				  {1,1,1,1,1,1,1,1,1,1,1,1,1},
				  {1,0,1,0,1,0,1,0,0,0,0,0,1},
				  {1,0,1,0,0,0,1,0,1,1,1,0,1},
				  {1,0,0,0,1,1,1,0,0,0,0,0,1},
				  {1,0,1,0,0,0,0,0,1,1,1,0,1},
				  {1,0,1,0,1,1,1,0,1,0,0,0,1},
				  {1,0,1,0,1,0,0,0,1,1,1,0,1},
				  {1,0,1,0,1,1,1,0,1,0,1,0,1},
				  {1,0,0,0,0,0,0,0,0,0,1,0,1},
				  {1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		int result = shortestPath(a, 0, 0, 8, 0);
		if(result == 100001)
		{
			System.out.println("No Possible path found");
		}
		else {
			System.out.println(result);
		}
		

	}
	//Whiling going into a path we will mark all points passed as TRUE and while returning we will set
//	them again to False(Not visited)
	
	static int shortestPath(int a[][], int i, int j, int x, int y)
	{
		int rows = a.length;
		int cols = a[0].length;
		boolean vis[][] = new boolean[rows][cols];
		
		
		return shortestPath(a, i, j, x, y, vis);
	}
	static boolean isValid(int a[][], int i, int j, boolean vis[][])
	{
		int rows = a.length;
		int cols = a[0].length;
		
		return i >=0 &&  j>=0 && i<rows && j<cols && a[i][j] == 1 && !vis[i][j];
			
		
	}
	static int shortestPath(int a[][], int i, int j, int x, int y, boolean vis[][])
	{
		if(!isValid(a, i, j, vis))
		{
			return 100000;  // return largest value
		}
		if(i==x && j==y) return 0;
		
		vis[i][j] = true;
		int left = shortestPath(a, i, j-1, x, y, vis) +1;
		int bottom = shortestPath(a, i+1, j, x, y, vis) +1;
		int right = shortestPath(a, i, j+1, x, y, vis) +1;
		int top = shortestPath(a, i-1, j, x, y, vis) +1;
		
		// This line makes backtracking possible
		vis[i][j] = false;
		
		return Math.min(Math.min(left, bottom), Math.min(right, top));

	}

}
