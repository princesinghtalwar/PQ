import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] input = {10,4,8,3};
//		int[] input = {1};
		int[] output = new int[input.length];
		output=leftRightDifference(input);
		for (int i : output) {
			System.out.print(i+", ");
		}
		
	}
	public static int[] leftRightDifference(int[] nums) {
		int s = nums.length;

		int[] output = new int[s];
		int[] outputR = new int[s];
		int[] answer = new int[s];
		int a = answer.length;
		int sum = Arrays.stream(nums).sum();
//		output = leftSum(nums);
//		outputR = RightSum(nums);
		output=answerArray(nums,sum);

		for (int i = 0; i < a; i++) {
			answer[i] = Math.abs(output[i] - outputR[i]);
		}
		return output;
	}

	public static int[] answerArray(int[] nums,int sum) {
		int len = nums.length;
		int[] l = new int[len];
		int sumLeft = 0;
		int sumRight= 0;
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				sumRight=sum-nums[i];
				sum=sumRight;
				continue;
			} else {
				sumLeft += nums[i - 1];
				sumRight=sum-nums[i];
				sum=sumRight;
			}
			l[i] = Math.abs(sumLeft-sumRight);
		}
		return l;
	}
	
	public static int[] leftSum(int[] nums) {
		int len = nums.length;
		int[] l = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				continue;
			} else {
				sum += nums[i - 1];
			}
			l[i] = sum;
		}
		return l;
	}

	public static int[] RightSum(int[] nums) {
		int len = nums.length;
		int[] l = new int[len];
		int sum = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (i == len - 1) {
				continue;
			} else {
				sum += nums[i + 1];
			}
			l[i] = sum;
		}

		return l;
	}

}