import java.util.Arrays;

public class shuffleTheArray {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};//123456-->142536
//		System.out.println(input.length);
		int n = input.length/2;
//		int [] out = shuffle(input,n);
		int [] out = alternateSort(input);
		System.out.print("Input: [");
		for (int i : input) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		System.out.print("Output: [");
		for (int i : out) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] output = new int[2*n];
		int j=0;	
		int l=0;
		int k=0;
		
		for (int i = 0; i < nums.length; i++) {			
			if(i==n)j=0;
			
			if(i<n) {
				arr1[j] = nums[i];
				j++;
			}else {				
				arr2[j] = nums[i];
				j++;
			}			
		}
		
		for (int i=0;i<nums.length;i++) {
			if(i%2==0) {
				output[i]=arr1[l];
				l++;
			}else {
				output[i]=arr2[k];
				k++;
			}
		}		
		return output;
	}
	
	public static int[] alternateSort(int[] input) {
		Arrays.sort(input);
		int[] out = new int[input.length];
		int s = 0;
		int e = input.length-1;
		int i = 0;
			while(s<=e) {
				if(i%2==0) {
					out[i]=input[e--];
				}else {
					out[i]=input[s++];
				}
				i++;
				}		
		return out;
	}
	
//	public static int[] shuffle(int[] nums, int n) {
//		int[] arr1 = new int[n];
//		int[] arr2 = new int[n];
//		int[] output = new int[2*n];
//		int j=0;	
//		int l=0;
//		int k=0;
//		
//		for (int i = 0; i < nums.length; i++) {			
//			if(i==n)j=0;
//			
//			if(i<n) {
//				arr1[j] = nums[i];
//				j++;
//			}else {				
//				arr2[j] = nums[i];
//				j++;
//			}			
//		}
//		
//		for (int i=0;i<nums.length;i++) {
//			if(i%2==0) {
//				output[i]=arr1[l];
//				l++;
//			}else {
//				output[i]=arr2[k];
//				k++;
//			}
//		}		
//		return output;
//	}
}

/*
 Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 

Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
 */