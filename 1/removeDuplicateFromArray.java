
public class removeDuplicateFromArray {

	public static void main(String[] args) {
//		int[] input = {1};
//		int[] input = {1,2,3,4};
//		int[] input = {1,1,2};
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		DisplayIn(input);
		System.out.println("Unique: "+removeDuplicates(input));
		DisplayOut(input);

	}
	
	public static int removeDuplicates(int[] nums) {
		int countUnique = 1;
		int start =0;
		int end = nums.length-1;		
		
		for (int i = 1; i < nums.length; i++) {
			while (start < end) {
				System.out.println("Start: " + start + ", End: " + end);
				if (nums[start] == nums[i]) {
					int temp = nums[i];
					nums[i] = nums[end];
					nums[end] = temp;
					end--;
				}
				start++;
			}
		}
		
//		DisplayIn(nums);
		
		return countUnique;
	}
	
//	public static int removeDuplicates(int[] nums) {
//		int countUnique = 0;
//		
//		
//		for(int i = 0;i<nums.length;i++) {
//			int val = nums[i];
//			int countDup = 0;
//			System.out.println("i: "+i);
//			for (int j = i+1; j < nums.length; j++) {
//				System.out.println("j: "+j);
//				if(nums[j]==val) {
//					nums[j]=101;
//					countDup++;
//				}
//			}
//				if(countDup>0)
//					countUnique++;
//		}
//		DisplayIn(nums);
//		moveDupAtEnd(nums);
//		
//		return countUnique;
//	}
	
	public static int moveDupAtEnd(int[] input) {
		int start = 0;
		int end = input.length-1;
				
			for(int i = start+1; i<input.length;i++) {				
					
				if(input[start]==101 && input[i]!=101) {
					int temp = input[start];
					input[start] = input[i];
					input[i] = temp;
					start++;
				}else if(input[start]==101 && input[i]==101){
					
				}else{
					start++;
				}
			}
			return start;
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

}

/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */
