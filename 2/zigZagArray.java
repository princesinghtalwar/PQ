
public class zigZagArray {

	public static void main(String[] args) {
		int[] input = {4, 3, 7, 8, 6, 2, 1};
		
		System.out.println("Before Sorting");
		for(int i =0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		sort(input);
		System.out.println("After Sorting");
		for(int i =0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
		for(int i =1;i<=input.length-2;i+=2) {
			int temp = input[i];
			input[i] = input[i + 1];
			input[i + 1] = temp;
			
		}
		
		System.out.println("Zig Zag ");
		System.out.println();
		for(int i =0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	
	public static void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	

}
//
//Sort the array.
//Traverse the array from index 1 to N-1, and increase the value of index by 2.
//While traversing the array swap arr[i] with arr[i+1].
//Print the final array.
