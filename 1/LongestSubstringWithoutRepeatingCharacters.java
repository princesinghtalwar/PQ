import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
//		String input = "abcabcbbadv";
		String input = "dvdf";//expected o/p: 3
		int out =lengthOfLongestSubstring(input);
		System.out.println("O/P: "+out);
	}
	public static int lengthOfLongestSubstring(String s) {		
		int len = s.length();
		int lenOfLongestSubstring = 0;
		int count =0;
		HashMap<Character, Integer> x = new HashMap<Character, Integer>();
		
		for (int i = 0; i < len;i++) {
			if(x.containsKey(s.charAt(i))) {
				count = x.keySet().size()-1;
				x.clear();
				x.put(s.charAt(i), i);				
//				lenOfLongestSubstring=count;
			}else {
				x.put(s.charAt(i), i);
				count++;
					if(count>lenOfLongestSubstring) {
						lenOfLongestSubstring=count;
					}
			}
//			System.out.println(lenOfLongestSubstring+" : "+count);
		}
		
        return lenOfLongestSubstring;
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

