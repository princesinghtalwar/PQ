public class targetArray {

	public static void main(String[] args) {
		int[] nums  = {1};
		int[] index = {0}; // Output: [0,4,1,3,2]
		
//		display(nums);
	  int [] out = createTargetArray(nums,index);
		display(out);
	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] out = new int[nums.length];
		
		for(int i = 0;i<out.length;i++) {
			if(i>index[i]) {
				int j =index[i];
				shift(out,nums,index,j,i);
//				for(int j =index[i];j<i;j++) {
//					int temp = nums[j];
//					out[j] = nums[i];
//					out[i] = temp;
//				}				
			}else {				
				out[index[i]] = nums[i];
			}	
			display(out);
		}
//        System.out.println();
        
        return out;
    }
	
	public static void shift(int[] out, int[] nums, int[] index, int j,int i) {
		int temp = nums[i];
		while(j<i) {
			out[i] = out[i-1];
			i--;
		}
		out[j] = temp;
	}
	
	public static void display(int[] arr){
		for(int e:arr)
			System.out.print(e+" ");
		System.out.println();
	}

}
/*
 
 1389. Create Target Array in the Given Order
Easy
1.8K
1.7K
Companies
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
