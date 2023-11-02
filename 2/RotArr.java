
public class RotArr {

	public static void main(String[] args) {
		RotArr ob = new RotArr();
		int[] in = {1,2,3,4,5,6,7};
		ob.display(in);
		ob.r(in);
		ob.l(in);
		ob.display(in);
		
		

	}
	
	void r(int[] input) {
		int i = input.length-1;
		int c = input[i];
		int j =i;
		
			while(j>0) {
				input[j]= input[j-1];
				j--;
			}
			input[j] = c;	
	}
	
	void l(int[] input) {
		int i = 0;
		int c = input[i];
		int j = i;
		while(j<input.length-1) {
			input[j] = input[j+1];
			j++;
		}
		input[j] = c;
	}
	
	void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
