
public class TwoDarray {

	public static void main(String[] args) {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		int r = image.length;
		int c = image[0].length;
		int[][] out = new int[r][c];
		
		for (int i = 0; i < image.length; i++) {
			for(int j = 0;j<image[i].length;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
		
//		System.out.println();
		for (int i = 0; i < image.length; i++) {
			for(int j = image[i].length-1;j>=0;j--) {
				if(image[i][j]==0)
					image[i][j]=1;
				else
					image[i][j]=0;
			}
//			System.out.println();
			
		}
		
		System.out.println();
		for (int i = 0; i < out.length; i++) {
			for(int j = 0;j<out[i].length;j++) {
				out[i][j] = image[i][(out[i].length-1)-j];
			}
//			System.out.println();
		}
		
//		System.out.println();
		for (int i = 0; i < out.length; i++) {
			for(int j = 0;j<out[i].length;j++) {
				System.out.print(out[i][j]+" ");
			}
			System.out.println();
		}

	}

}
