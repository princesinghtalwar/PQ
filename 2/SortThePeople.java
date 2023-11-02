
public class SortThePeople {
	
	public static void main(String[] args) {
		String[] names = {"Alice","Bob","Bob"};
		int[] heights = {155,185,150};
//		sort(names,heights);
		sortInMerge(names,heights,0,heights.length-1);
		
		for (int i = 0; i < heights.length; i++) {
			System.out.print(names[i]+", ");
		}
	}
	
	public static void sort(String[] names,int[] heights) {		
		for (int i = 0; i < heights.length; i++) {
			int max = heights[i];			
			for (int j = i; j < heights.length; j++) {
				if(heights[j]>max) {
					max = heights[j];
					heights[j] = heights[i];
					heights[i] = max;
					
					String temp = names[j];
					names[j] = names[i];
					names[i] = temp;					
				}
			}			
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+", ");
		}
		System.out.println();
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i]+", ");
		}
		
	}
	
	public static void sortInMerge(String[] names,int[] heights,int left,int right) {
		if(left<right) {
			int middle = left + (right-left)/2;
			sortInMerge(names,heights, left, middle);
			sortInMerge(names,heights, middle+1, right);
			merge(names,heights,left,middle,right);
		}
	}
	
	public static void merge(String[] names,int[] heights, int left, int middle, int right) {
		int leftSize = middle - left + 1;
		int rightSize = right - middle;
		
		int[] leftArr = new int[leftSize];
		int[] rightArr = new int[rightSize];
		
		String[] leftArrNames = new String[leftSize];
		String[] rightArrNames = new String[rightSize];
		
		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = heights[left+i];
			leftArrNames[i] = names[left+i];
		}
		
		
		for (int i = 0; i < rightArr.length; i++) {
			rightArr[i] = heights[middle+1+i];
			rightArrNames[i] = names[middle+1+i];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
			
		while(i<leftSize && j<rightSize) {
			if(leftArr[i]>=rightArr[j]) {
				heights[k] = leftArr[i];
				names[k] = leftArrNames[i];
				i++;
			}else {
				heights[k] = rightArr[j];
				names[k] = rightArrNames[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			heights[k] = leftArr[i];
			names[k] = leftArrNames[i];
			i++;
			k++;
		}
		while(j<rightSize) {
			heights[k] = rightArr[j];
			names[k] = rightArrNames[j];
			j++;
			k++;
		}
	}
}

/*
 You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 

Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */