// is the input array in Arithmetic Progression or Not.

import java.util.Arrays;

public class IsAP {

	public static void main(String[] args) {
		int[] input = {0,12,4,8};//true
		int[] input1 = {12,40,11,20};//false
		
		System.out.println(isAP(input1));

	}
	
	public static boolean isAP(int[] input) {
		Arrays.sort(input);
		boolean flag = true;
		
		int d = input[1]-input[0];
		int i = 1;
		int j = i+1;
		
		while(j<input.length) {
			if(d != (input[j]-input[i])) {
				flag = false;
			}
			i++;
			j++;
		}		
		return flag;
	}

}
