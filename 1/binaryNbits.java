
public class binaryNbits {

	public static void main(String[] args) {
		int[] input = new int[5];
		binNbits(input, input.length);
	}
	
	public static void binNbits(int[] input,int n) {
		if(n<1)
			printArray(input);
		else {
			input[n-1] =0;
			binNbits(input, n-1);
			input[n-1] =1;
			binNbits(input, n-1);
		}
	}

	private static void printArray(int[] input) {
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
		System.out.println();
		
	}

}
