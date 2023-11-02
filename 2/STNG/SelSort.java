package STNG;

public class SelSort {

	public static void main(String[] args) {
		int[] in = {5,4,3,2,1};
//		Sort(in);
		SortStable(in);
		display(in);
	}

	public static void Sort(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len - 1; i++) {
			int min_idx = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx])
					min_idx = j;
			}

			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}		
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void SortStable(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len - 1; i++) {
			int min_idx = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx])
					min_idx = j;
			}

			int key = arr[min_idx];
			
			while(min_idx>i) {
				arr[min_idx] = arr[min_idx-1];
				min_idx--;
			}
			arr[i] = key;
			
		}		
	}
	
}
