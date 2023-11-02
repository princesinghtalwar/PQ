import java.util.HashMap;

public class maximumNoOfPairsInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 1, 3, 2, 2 };
		MAXIMUM_NO_OF_PAIRS_IN_ARRAY(nums);
	}

	public static int[] MAXIMUM_NO_OF_PAIRS_IN_ARRAY(int[] nums) {
		HashMap<Integer, Integer> out = new HashMap<>();
		int[] result = new int[2];
		int countPair = 0;
		for (int i : nums) {
			if (out.containsKey(i)) {
				out.put(i, out.get(i) + 1);
				if ((out.get(i) + 1 == 3)) {
					countPair++;
					out.put(i, 0);
				}
			} else {
				out.put(i, 1);
			}
		}
		int leftOverCount = 0;
		for (int f : out.values()) {
			leftOverCount += f;
		}
		result[0] = countPair;
		result[1] = leftOverCount;
		for (int i : result) {
			System.out.print(i + " ");
		}
		return nums;
	}

}
