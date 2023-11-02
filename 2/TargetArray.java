import java.awt.DisplayMode;
import java.util.Arrays;

public class TargetArray {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] target = createTargetArray(nums, index);
		display(target);
	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
//		Arrays.sort(index);
//		display(index);
		for(int i=0;i<nums.length;i++) {
			if(i<=index[i])
				target[index[i]] = nums[index[i]];
			else {
//				int temp = target[index[i]];
////				target[index[i]] = nums[i];
////				nums[i] = temp;
//				int tp = index[i];
//				int k = i;
//				while(k<tp) {
//					target[k] = target[k-1];
//					k--;
//				}
//				target[k] = temp;
//				System.out.println("Shifting Required : "+i+","+index[i]+","+nums[index[i]]);
			}
		}		
		return target;
	}
	
	public static void display(int[] nums) {
		for(int a : nums)
			System.out.print(a+" ");
	}

}

/*
 Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
 

Constraints:

1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
 */
