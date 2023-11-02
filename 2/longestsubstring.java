import java.util.HashMap;

public class longestsubstring {

	public static void main(String[] args) {
		String input = "abcabcbb";
		lengthOfLongestSubstring(input);
	}

	
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Integer,Character> hm = new HashMap<>();
		int len = s.length();
			
		for(int i =0;i<len;i++) {
//			System.out.println(hm.containsValue(s.charAt(i)));
			if(!hm.containsValue(s.charAt(i))) {
				hm.put(i,s.charAt(i));
			}else {
//				hm.remove(i,s.charAt(i));				
//				hm.put(i,s.charAt(i));
			}
		}
		System.out.println(hm);
		return -1;
	}
}

/*
 Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */