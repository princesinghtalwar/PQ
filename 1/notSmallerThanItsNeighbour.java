public class notSmallerThanItsNeighbour {

	public static void main(String[] args) {
		int[] input = {5,10,20,15};
		int out = notSmallerthanitsNeigh(input);
		System.out.println("Result: "+out);
//		reverseArr(input);
//		int[] out = sortArr(input);
//		for (int i : out) {
//			System.out.print(i+" ");
//		}
//		int k = 2; // for Kth smallest element;
//		System.out.println();
//		System.out.println(out[k-1]);
	}
	
	public static int notSmallerthanitsNeigh(int[] input) {
		int num = input[0];
		
		if(input.length==1) {
			return input[0];
		}else if(input.length==2) {
			return input[0]>input[1]?input[0]:input[1];
		}
		if(num>input[1])
			return num;
		else if(num>input[input.length-2])
			return num;
		
			for(int i = 1; i<input.length-1; i++){
				if(input[i]>=input[i-1] && input[i]>input[i+1]) {
					return input[i];
				}
			}
			return 0;
	}
	
	public static int[] reverseArr(int[] input) {
		int s = 0;
		int e = input.length-1;
		
			while(s<e) {
				int temp = input[s];
				input[s] = input[e];
				input[e] = temp;
				s++;
				e--;
			}
		
		return input;
	}
	
	public static int[] sortArr(int[] input) {//Ascending order
//		int min = input[0];
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[j]<input[i]) {
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
		return input;
	}
}

/*
 Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

Note: For corner elements, we need to consider only one neighbor. 

Example:

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 */
