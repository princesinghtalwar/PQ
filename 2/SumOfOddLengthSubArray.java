
public class SumOfOddLengthSubArray {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}
	
	public static int sumOddLengthSubarrays(int[] arr) {
		int l = arr.length;
		int n = 0;
		int upto = 0;
		int sum = 0;
		while(upto<=l) {
			upto = (2*n+1);
			sum +=sumArr(arr,upto);
			System.out.println(upto);
			n++;
		}
		return sum;
	}
	
	public static int sumArr(int[] arr,int n) {
		int sum = 0;
		for (int i=0;i<=n;i++) {
			System.out.print(i+" ");
			sum +=i;
		}
		System.out.println();
		return sum;
	}
}

/*
 Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
Example 3:

Input: arr = [10,11,12]
Output: 66
 

Constraints:

1 <= arr.length <= 100
1 <= arr[i] <= 1000
 */
