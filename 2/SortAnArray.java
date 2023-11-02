
public class SortAnArray {

	public static void main(String[] args) {
		int[] input = {-2,3,-5};
		sort(input,0,input.length-1);
		display(input);

	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] sortArray(int[] nums) {
		 sort(nums,0,nums.length-1);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		return nums;
	}
	
	public static void sort(int[] arr, int l, int r) {
		System.out.println(l+","+r);
		if(l<r) {
			int m = l + (r-l)/2;
//			System.out.println("M "+m);
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int [n2];
		
		for(int i = 0; i<n1;i++)
			L[i] = arr[l+i];
		
		for (int j = 0; j <n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i<n1 && j < n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
		k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}

/*
 Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
  */