import java.util.Random;

public class ms {

	public static void main(String[] args) {
//		int[] arr = {5,4};
		Random r = new Random();
		int max = 100;
		int min = 1;
		
		int [] arr = new int[5];
		for (int a = 0; a < arr.length; a++) {
		    arr[a] = r.nextInt(max-min+1) + min;
		}
		display(arr);
		s(arr,0,arr.length-1);
		display(arr);
	}
	
	public static void s(int[] arr, int left, int right) {
		if(left<right) {
			int m = left + (right - left) / 2;
//			System.out.println(left+" , "+m+", "+right);
			s(arr,left,m);
			s(arr,m+1,right);
			m(arr,left,m,right);
		}
	}
	
	public static void m(int[] arr, int left, int m, int right) {
		int leftSize = m-left+1;
		int rightSize = right-m;
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		for(int i=0; i<leftSize; i++)
			leftArray[i] = arr[left+i];
		
		for(int i=0; i<rightSize; i++)
			rightArray[i] = arr[m+1+i];
		
		int i = 0;
		int j = 0;
		int k = left;
		while(i<leftSize && j<rightSize) {
			if(leftArray[i]<rightArray[j]) {
				arr[k] = leftArray[i++];
			}else {
				arr[k] = rightArray[j++];
			}
			k++;
		}
		
		while(i<leftSize) {
			arr[k++] = leftArray[i++];
		}
		
		while(j<rightSize) {
			arr[k++] = rightArray[j++];
		}
		
	}
	
	public static void display(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
