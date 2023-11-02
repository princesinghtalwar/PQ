
public class reverseArray {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int[] output = reverseArray(input);
		
		Display(input, output);
		
	}

	private static void Display(int[] input, int[] output) {
		System.out.print("INPUT: [");
		for(int e : input) {
			System.out.print(e+" ");
		}
		System.out.println("]");
		
		System.out.print("OUTPUT: [");		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println("]");
	}
	
	public static int[] reverseArray(int[] input) {
		int start = 0;
		int end = input.length-1;
		
		while(start<end) {
			int temp = input[start];
			input[start]=input[end];
			input[end]=temp;
			start++;
			end--;
		}
		
		return input;
	}
}
