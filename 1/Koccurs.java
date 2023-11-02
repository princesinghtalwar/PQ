import java.util.HashMap;

public class Koccurs {
	public static void main(String[] args) {
		
		int[] input = {1,7,4,3,4,8,7};
		int k=1;
		
		System.out.println(solve(input,k));
//		
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		for(int i=0;i<input.length;i++) {
//			if(!hm.containsKey(input[i])) {
//				hm.put(input[i], 1);
//				if(hm.get(input[i])==k) {
//					System.out.println(input[i]);
//					return;
//				}
//			}else {
//				hm.put(input[i], hm.get(input[i])+1);
//				if(hm.get(input[i])==k) {
//					System.out.println(input[i]);
//					return;
//				}
//			}
//		}		
	}
	
	public static int solve(int[] input, int k) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<input.length;i++) {
			if(!hm.containsKey(input[i])) {
				hm.put(input[i], 1);
				if(hm.get(input[i])==k) {
					return input[i];
				}
			}else {
				hm.put(input[i], hm.get(input[i])+1);
				if(hm.get(input[i])==k) {
					return input[i];
				}
			}
		}
		return Integer.MIN_VALUE;
	}
}
