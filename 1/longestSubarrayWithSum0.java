
public class longestSubarrayWithSum0 {

	public static void main(String[] args) {
		int[] input = {15,-2,2,-8,1,7,10,23};// O: 5
//		int[] input = {1,2,3};// O: 0
//		int[] input = {1,0,3};// O 1
		System.out.println(lengthOfLongestSubarrayWithSum0(input));

	}
	
	public static int lengthOfLongestSubarrayWithSum0(int[] input) {
		int len = 0;
		int w = 1;
		
			while(w<=input.length) {
				int start = 0;
				int j = w;
				int sum = 0;
				
				while(j<input.length) {
//					System.out.println("start: "+start+" j: "+j);
					for(int i = start;i<j;i++) {
						sum += input[i];
					}
					
					if(sum==0) {
						len = w;
						break;
					}
					sum =0;
					start++;
					j++;
				}
				w++;					
			}		
		return len;
	}

}
