import java.util.HashMap;

public class containsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate1(nums));
	}
	
	public static boolean containsDuplicate1(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){            	
            	h.put(nums[i], 1);
            }else
            	h.put(nums[i], h.get(nums[i])+1);
        }
        System.out.println(h+"--"+h.values());
        	
        for(int a : h.values()) {
        	if(a>1)
        		return true;
        }
        
        return false;
    }
	

}

/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */