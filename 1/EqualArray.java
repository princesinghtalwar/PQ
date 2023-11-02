import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,1};
		int[] a2 = {1,3,2,0};
		System.out.println(isArraysEqual(a1,a2));

	}
	
	public static boolean isArraysEqual(int[] ar1, int[] ar2) {
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i = 0; i<ar1.length;i++) {
			if(ar1[i]!=ar2[i])
				return false;
		}
		return true;
	}

}
