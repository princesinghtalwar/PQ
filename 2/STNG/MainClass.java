package STNG;

public class MainClass {

	public static void main(String[] args) {
//		int[] input = {5,4,3,2,1};
//		InsSort is = new InsSort();
//		is.Sort(input);
//		display(input);
		int a = 5;
		int b = a++ + ++a;
		System.out.println(b);
		
		
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
