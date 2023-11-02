public class CanPlaceFlower {

	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,1,0};
		int n = 3;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int placed = 1;
		boolean flag = false;
		while(placed < n || placed == n) {
			
			for (int i = 1; i < placed+1; i++) {
				if(flowerbed[i-1] == flowerbed[i]) {					
					if(flowerbed[i]==0) {
						flowerbed[i]=1;
						if(isValidPlaced(flowerbed)) {
							flag = true;
							break;
						}
					}else {
						if(flowerbed[i]==0) {
							flowerbed[i]=1;
						}else {
							flowerbed[i-1]=1;							
						}
					}
				}
			}
			display(flowerbed);
			if(flag)placed++;
		}		
		
		return isValidPlaced(flowerbed);
	}
	
	public static boolean isValidPlaced(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i])
				return false;
		}
		return true;
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
/*
 You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
 */
