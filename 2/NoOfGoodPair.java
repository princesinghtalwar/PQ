import java.util.HashMap;

public class NoOfGoodPair {

	public static void main(String[] args) {
		int[] nums = {1,1,1,1};
		System.out.println(numIdenticalPairs(nums));
	}
	
	public static int numIdenticalPairs(int[] nums) {
		int count = 0;
		for (int i=0;i<nums.length;i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j])
					count++;
			}
		}
		return count;
	}
	
	
//	public static int numIdenticalPairs(int[] nums) {
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		for (int i=0;i<nums.length;i++) {
//			if(hm.containsValue(1))
//				System.out.println("PPPPP");
//			hm.put(i,nums[i]);
//		}
//		
//		System.out.println(hm);
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		return 0;
//	}
}

/* 
 {
 	0=1, 
 	1=2, 
 	2=3, 
 	3=1, 
 	4=1, 
 	5=3
 }
*/

/*
 Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */