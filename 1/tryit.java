
public class tryit {

	public static void main(String[] args) {
//		int input[] = {2,4,1};
		int input[] = {3,2,6,5,0,3};
//		int input[] = {2,1,2,1,0,1,2};
		buySell(input);
		//int a = isSrtd(input,4);
		//System.out.println("A: "+a);

	}
	
	private static void buySell(int prices[]) {
		int l = prices.length;
		
		int b = prices[0];
		int s = prices[0];
		int bTemp = prices[0];
		int sTemp = prices[0];
		int maxProfit = 0;
		int maxProfitTemp = s-b;
		
		for(int i = 0;i<l;i++) {
			if(prices[i]<b && i<(l-1)) {	
				b = prices[i];
				s = prices[i];
				maxProfitTemp=s-b;
				if(maxProfit<maxProfitTemp) {
					bTemp=b;
					sTemp=s;
					maxProfit=maxProfitTemp;
				}
			}else if(prices[i]>s) {				
				s = prices[i];
				maxProfitTemp=s-b;
				if(maxProfit<maxProfitTemp) {
					bTemp=b;
					sTemp=s;
					maxProfit=maxProfitTemp;
				}
			}
		}
		
		System.out.println("Buy at Rs: "+bTemp+" And Sell at Rs: "+sTemp);
		System.out.println("Maximum Profit: "+maxProfit);
	}
	
	 public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j+1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	
	private static int isSrtd(int[] arr,int  n) {
		if(n==1)
			return 1;
		return (arr[n-1]<arr[n-2]?0:isSrtd(arr,n-1));
		
	}

}
