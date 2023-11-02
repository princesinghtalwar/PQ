
public class RomToInt {

	public static void main(String[] args) {
//		String input = "LVIII";
//		String input = "MCMXCIV";
//		String input = "MDCXCI";
		String input = "D";
		
		System.out.println(romanToInt(input));

	}
	
	public static int romanToInt(String s) {
		int len = s.length();
		int num = 0;
		
		if(s.length() == 1)
			return valueChar(s.charAt(0));
		
		for(int i = 0,j = 1; i<len && j<len; i++) {
			if(valueChar(s.charAt(j))<=valueChar(s.charAt(i))) {				
				num += valueChar(s.charAt(i));
				if(j==len-1)
					num += valueChar(s.charAt(j));
				j++;
			}else {				
				num += (valueChar(s.charAt(j)) - valueChar(s.charAt(i)));
				i++;
				j+=2;
				
				if(j>len-1) {
					if(++i==len-1)
						num += valueChar(s.charAt(i));
				}
			}
		}
		return num;        
    }
	
	public static int valueChar(char c) {
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		
		return 0;
	}
	
//	public static int romanToInt(String s) {
//		int len = s.length();
//		int num = 0;
//		for(int i = 0; i<len; i++) {
//			if(s.charAt(i)=='I')
//				num += 1;
//			if(s.charAt(i)=='V')
//				num += 5;
//			if(s.charAt(i)=='X')
//				num += 10;
//			if(s.charAt(i)=='L')
//				num += 50;
//			if(s.charAt(i)=='C')
//				num += 100;
//			if(s.charAt(i)=='D')
//				num += 500;
//			if(s.charAt(i)=='M')
//				num += 1000;
//			
//			//System.out.println(s.charAt(i));
//		}
//		return num;        
//    }
}

/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
