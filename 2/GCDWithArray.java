
public class GCDWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findGCD(int[] nums) {
	        int a,b;
			
			int min = nums[0];
			int max = nums[0];
			
			for(int i =0; i<nums.length;i++) {
				if(nums[i]<min)
					min = nums[i];
				if(nums[i]>max)
					max = nums[i];
					
			}
			a=min;
			b=max;		
	        
			int result=1;
			if(a==b)
				return a;
			if(a==0 || b==0)
				return 0;
			
				for(int i=2;i<=b/2;) {
					if(a%i==0 && b%i==0) {
						System.out.print(i+" ");
						result*=i;
						a/=i;
						b/=i;
					}else {
						i++;
					}
				}
			return result;
		
	    }
}
