package STNG;

public class countSort {

	public static void main(String[] args) {
		int[] input = {2,9,7,4,1,8,4};
		System.out.print("Input: ");
		display(input);
		Sort(input);
	}
	
	public static void Sort(int[] arr) {
		int[] countSorted = new int[arr.length];
		int countLength = getMaxElement(arr)+1;
		int[] count = new int[countLength];
		
		for(int i=0;i<countLength;i++) {
			count[i] = 0;
		}
		
		for (int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		display(count);
		
		for(int i =1;i<countLength;i++) {
			count[i] += count[i-1];
		}
		display(count);
		
		for(int i =0; i<arr.length;i++) {
			countSorted[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		System.out.print("Output: ");
		display(countSorted);
	}
	
	public static int getMaxElement(int[] arr) {
		if(arr.length>0) {			
			int max = arr[0];
			for (int i : arr) {
				if(i>max)
					max = i;
			}
			return max;
		}else {
			System.out.println("Invalid Input!!");
		}		
		return 0;
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
