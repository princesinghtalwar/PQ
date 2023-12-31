import java.util.LinkedList;
import java.util.List;

public class Permutation1 {

	public static void main(String[] args) {
		int[] input = {1,2,3};
		System.out.println(permute(input));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> out  = new LinkedList();
        List<Integer> perm = new LinkedList<>();
        int j = nums.length;
        for(int i = 0; i<nums.length;i++) {
        	perm.add(nums[i]);
//        	permute(nums);
        }
        	out.add(perm);
        	System.out.println(perm);
//        	System.out.println(out);
        
        return out;
        
    }

}
/*
 Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
 */