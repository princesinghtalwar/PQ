
public class ConcatenationOfArray {

	public static void main(String[] args) {
		int[] nums = {1,3,2,1};
		display(nums);
		int[] ans = getConcatenation(nums);
		display(ans);
		
		
		
	}
	
	
	public static int[] getConcatenation(int[] nums) {		
		int l = nums.length;	
		int[] ans = new int[2*l];
		
		for(int i = 0; i<2*l;i++) {
			if(i<l)
				ans[i] = nums[i];
			else
				ans[i] = nums[i%l];
		}
		return ans;
	}
	
	public static void display(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

/*
 Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */
