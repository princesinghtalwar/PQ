package STNG;

public class BubSort {

	public static void main(String[] args) {
		int[] input = {5,4,3,2,1};
		bubbleSort(input);
		display(input);
	}
	
	public static void bubbleSort(int[] arr) {
		boolean swapped;
		int len = arr.length;
		
			for (int i = 0; i < len-1; i++) {
				swapped = false;
				for (int j = 0; j < len-i-1; j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swapped = true;
					}
				}
				if(swapped = false)
					break;
			}
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
