package Algorithms.AdvanceRecursion;

/*
   Question is explained in this folder in .svg high quality image.
    Given 2x2 matrix, you have to Fill all connected points of same number with the another number given
    the connected points can be Top, bottom, left, right.
    
    1> base cond : 
 */

public class Matrix_FloodFill {

	public static void main(String[] args) {
		int a[][] = {{1, 1, 1, 2, 1, 1, 1}, 
					 {2, 2, 1, 2, 2, 1, 1},
					 {0, 2, 2, 2, 1, 1, 1},
					 {1, 1, 2, 2, 1, 2, 2},
					 {1, 0, 0, 2, 2, 0, 0}
					};
		System.out.println("Before Fill : ");
		print(a);
		floodFill(a, 2, 3, 4, 2);
		System.out.println("After Fill : ");
		print(a);

	}
	static void floodFill(int a[][], int r, int c, int toFill, int prevFill)
	{
		int rows = a.length;
		int cols = a[0].length;
		//base condition
		if(r<0 || r>=rows || c<0 || c>=cols)   // if the given r, c is beyond the matrix size or -ve
		{
			return;
		}
		if(a[r][c] != prevFill)  // if current element is not previous element
		{
			return;
		}
		a[r][c] = toFill;
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
		
	}
	static void print(int a[][])
	{
		int r = a.length;
		int c = a[0].length;
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
