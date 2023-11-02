
public class diagonalSum {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		display(input);
	}
	
	static void display(int[][] arr) {
		int sum = 0;
		int sum1 = 0;
		System.out.println("Length :: "+arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"      ");
				if(i==j || (arr[i].length-1) == (i+j))
					sum +=arr[i][j];
//				if((arr[i].length-1) == (i+j))
//					sum1+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Pd: "+sum);
		System.out.println("Sd: "+sum1);
	}

}
