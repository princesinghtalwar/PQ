//Java program for the above approach
import java.util.*;

class Spiral {

	// Function to print in spiral order
	public static List<Integer> spiralOrder(int[][] matrix)
	{
		List<Integer> ans = new ArrayList<>();

		if (matrix.length == 0)
			return ans;

		int m = matrix.length, n = matrix[0].length;
		boolean[][] seen = new boolean[m][n];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int x = 0, y = 0, di = 0;

		// Iterate from 0 to R * C - 1
		for (int i = 0; i < m * n; i++) {
			ans.add(matrix[x][y]);
			seen[x][y] = true;
			int cr = x + dr[di];
			int cc = y + dc[di];

			if (0 <= cr && cr < m && 0 <= cc && cc < n
				&& !seen[cr][cc]) {
				x = cr;
				y = cc;
			}
			else {
				di = (di + 1) % 4;
				x += dr[di];
				y += dc[di];
			}
		}
		return ans;
	}

	public static List<Integer> spiralOrder1(int[][] matrix)
	{
		List<Integer> res = new ArrayList<>();
		
		if(matrix.length==0)
		return res;
		
		int m = matrix.length , n = matrix[0].length;
		
		boolean[][] seen = new boolean[m][n];
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		int x=0,y=0,di=0;
		
		for(int i=0;i<m*n;i++){
			res.add(matrix[x][y]);
			seen[x][y] = true;
			
			int cr = x + dr[di];
			int cc = y + dc[di];
			
			if(cr>=0 && cr<m && cc>=0 && cc<n && !seen[cr][cc]){
				x = cr;
				y = cc;
			}else{
				di = (di+1)%4;
				x += dr[di];
				y += dc[di];
			}
		}
		return res;
	}
	
	public static int KthElementSpiralOrder(int[][] matrix,int k)
	{
		List<Integer> res = new ArrayList<>();
		
		if(matrix.length==0)
		return 0;
		
		int m = matrix.length , n = matrix[0].length;
		
		boolean[][] seen = new boolean[m][n];
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		int x=0,y=0,di=0;
		
		for(int i=0;i<m*n;i++){
			res.add(matrix[x][y]);
			seen[x][y] = true;
			
			int cr = x + dr[di];
			int cc = y + dc[di];
			
			if(cr>=0 && cr<m && cc>=0 && cc<n && !seen[cr][cc]){
				x = cr;
				y = cc;
			}else{
				di = (di+1)%4;
				x += dr[di];
				y += dc[di];
			}
		}
		
		return res.get(k-1);
	}
	
	public static int[][] generateMatrix(int pp) {
		int[][] matrix = new int[pp][pp];
		
		if(pp==0)
			return matrix;
		
		int m = pp , n = pp;
		
		boolean[][] seen = new boolean[m][n];
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		int x=0,y=0,di=0;
		
		for(int i=0;i<m*n;i++){
			matrix[x][y]=i;
			seen[x][y] = true;
			
			int cr = x + dr[di];
			int cc = y + dc[di];
			
			if(cr>=0 && cr<m && cc>=0 && cc<n && !seen[cr][cc]){
				x = cr;
				y = cc;
			}else{
				di = (di+1)%4;
				x += dr[di];
				y += dc[di];
			}
		}
		
		return matrix;
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		int[][] a = { { 1, 2, 3, 4 },
					{ 12, 13, 14, 5 },
					{ 11, 16, 15, 6 },
					{ 10, 9, 8, 7 } };

		// Function call
//		System.out.println(spiralOrder1(a));
//		System.out.println(KthElementSpiralOrder(a,10));
		
		int size = 5;
		int[][] output = new int[size][size];
		
		output = generateMatrix(size);
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

