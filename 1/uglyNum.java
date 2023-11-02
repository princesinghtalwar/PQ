public class uglyNum {
	public static void main(String[] args) {
		int input = 24;
		boolean Ugly = isUgly(input);
		boolean Uglyrec = isUglyRec(input);
		System.out.println(input+" is Ugly Number: "+Ugly);
		System.out.println(input+" is UglyREC Number: "+Uglyrec);
	}
	
	 public static boolean isUgly(int num) {
	        if(num <= 0) return false;
	        while((num % 2) == 0) num /= 2;
	        while((num % 3) == 0) num /= 3;
	        while((num % 5) == 0) num /= 5;
	        return num == 1;
	    }
	 
	 public static boolean isUglyRec(int num) {
	        if(num <= 0) return false;
	        if(num==1) return true;
	        if((num % 2) == 0) return(isUglyRec(num/2));
	        if((num % 3) == 0) return(isUglyRec(num/3));
	        if((num % 5) == 0) return(isUglyRec(num/5));
	       
	        return false;
	    }
	 
		public static int isprime(int n) {

			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return 0;
			}

			return 1;
		}

		public static void primeFactors(int n) {
			for (int i = 2; i <= n; i++) {
				if (isprime(i) == 1) {
					int x = n;
					while (x % i == 0) {
						System.out.print(i + " ");
						x /= i;
					}
				}
			}

		}
		
}

/*
 
 An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 

Constraints:

POW(-2,31) <= n <= POW(2,31) - 1
  
 */
 