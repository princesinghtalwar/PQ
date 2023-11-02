
public class LeftNRightSumDifference {

	public static void main(String[] args) {
		int[] input = {10,4,8,3};
//		int[] input = {1};
		int[] output = new int[input.length];
		int[] outputR = new int[input.length];
		int[] answer = new int[input.length];
		output = leftSum(input);
		outputR = RightSum(input);
		
		for(int i = 0;i<answer.length;i++) {
			answer[i]= Math.abs(output[i] - outputR[i]);
		}
		
		
		for (int i : output) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		for (int i : outputR) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		for (int i : answer) {
			System.out.print(i+", ");
		}
	}
	
	public static int[] leftSum(int[] nums) {
		int[] l = new int[nums.length];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			if(i==0) {
				continue;
			}else {
				sum+=nums[i-1];
//				for(int j=0;j<i;j++) {
//					sum += nums[j];
//				}
			}
			l[i]=sum;
			//sum=0;
		}
		
     return l;
    }
	
	public static int[] RightSum(int[] nums) {
		int[] l = new int[nums.length];
		int sum=0;
		for(int i=nums.length-1;i>=0;i--) {
			if(i==nums.length-1) {
				continue;
			}else {
				sum += nums[i+1];
//				for(int j=nums.length-1;j>i;j--) {
//					sum += nums[j];
//				}
			}
			l[i]=sum;
//			sum=0;
		}
		
     return l;
    }
	
}


/*

2574. Left and Right Sum Differences
Easy
580
42
Companies
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

-> leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
-> rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105

*/