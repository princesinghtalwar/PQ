
public class GCDofTwoNumbers {

	public static void main(String[] args) {
		
//		int[] input = {6,10,5,5};
//		int[] out = minMax(input);
//		
//		int a = out[0];
//		int b = out[1];
//		System.out.println("Min: "+a+" Max: "+b);
//		int result = findGCD(a,b);
//		System.out.println();
//		System.out.println(result);
		
//		getGCD(24,36);
		getPrimeFactors(30030);
	}
	
	public static int findGCD(int a, int b) {
		int result=1;
		if(a==b)
			return a;
		if(a==0 || b==0)
			return 0;
		
		if(a>b) {
			for(int i=2;i<=a/2;) {
				if(a%i==0 && b%i==0) {
					System.out.print(i+" ");
					result*=i;
					a/=i;
					b/=i;
				}else {
					i++;
				}
			}			
		}else {
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
		}
		return result;
	}
	
	public static int[] minMax(int[] nums) {
		int[] out = new int[2];
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i =0; i<nums.length;i++) {
			if(nums[i]<min)
				min = nums[i];
			if(nums[i]>max)
				max = nums[i];
				
		}
		out[0]=min;
		out[1]=max;
		
		return out;
		
	}
	
	public static void getGCD(int a, int b) {
		if(a==0||b==0) {					
			System.out.println(a==0?b:a);
			return;
		}
		int temp ;
			if(a<b) {
				temp = a;
					if(b%temp!=0) {
						getGCD(b%temp,temp);
					}else {
						System.out.println(temp);
					}
			}else {
				temp = b;
				
				if(a%temp!=0) {
					getGCD(a%temp,temp);
				}else {
					System.out.println(temp);
				}
				
			}
	}
	
	public static void getPrimeFactors(int num) {
		if(num==0) {
			System.out.println(0);
			return;
		}
		else if(num==1) {
			System.out.println(1);
			return;
		}
		int a = num;
		for(int i = 2;i<=a;i++) {
			while(a%i==0) {				
				System.out.print(i+" ");
				a/=i;
			}
		}
	}

}
