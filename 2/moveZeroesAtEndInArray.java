
public class moveZeroesAtEndInArray {

	public static void main(String[] args) {
//		int[] input = {0,0,2,0,0};
//		int[] input = {1,0,1};
//		int[] input = {0};
		int[] input = {0,1,0,3,12};// [1,3,12,0,0]
		DisplayIn(input);
		 moveZeroes(input);
		DisplayOut(input);

	}
	
	public static void moveZeroes(int[] input) {
		int start = 0;
		int end = input.length-1;
		
			for(int i = start+1; i<input.length;i++) {				
					
				if(input[start]==0 && input[i]!=0) {
					int temp = input[start];
					input[start] = input[i];
					input[i] = temp;
					start++;
				}else if(input[start]==0 && input[i]==0){
					
				}else{
					start++;
				}
//				System.out.print("Attempt "+i+": ");
//				DisplayAt(input);
			}
	}
	
	private static void DisplayIn(int[] input) {
		System.out.print("INPUT: [");
		for(int e : input) {
			System.out.print(e+" ");
		}
		System.out.println("]");
		
	}
	private static void DisplayOut(int[] output) {
		System.out.print("OUTPUT: [");		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println("]");
		
	}
	private static void DisplayAt(int[] input) {
		System.out.print(" [");
		for(int e : input) {
			System.out.print(e+" ");
		}
		System.out.println("]");
		
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

}
