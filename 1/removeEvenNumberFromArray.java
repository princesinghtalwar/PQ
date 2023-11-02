import java.util.Iterator;

public class removeEvenNumberFromArray {
	public static void main(String args[]) {
		int input[] = {1,2,3,4,5,6};
		int output[] = removeEven(input);
		
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
	
	public static int[] removeEven(int[] input) {
		int oddCount = 0;		
		int idx=0;
		
		for(int i = 0;i<input.length;i++) {
			if(input[i]%2!=0) {
				oddCount++;
			}
		}
		int[] output = new int[oddCount];
		for(int i=0;i<input.length;i++) {
			if(input[i]%2!=0) {
				output[idx]=input[i];
				idx++;
			}
		}		
		return output;
	}
}
