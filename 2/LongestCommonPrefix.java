
public class LongestCommonPrefix {

	public static void main(String[] args) {
//		String[] strs = {"flower","flow","flight"};
//		String[] strs = {"reflower","flow","flight"};
		String[] strs = {"a","aca","accb","b"};
//		String[] strs = {"acc","aaa","aaba"};
		String s1 = "acc";
		String s2 = "aaa";
//		System.out.println(longestPrefix(s1,s2));
		System.out.println("Longest Prefix:: "+longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String out = "";
		
		if(strs.length==1)
			return strs[0];
		
		for (int i = 0,j=1;i<strs.length;i++,j++) {
			String temp = "";
			
			if(j==strs.length)
				return out;
			
			if (j < strs.length)
				temp = longestPrefix(strs[i], strs[j]);
			
			if (temp.isEmpty())
				return "";
			
			if(!out.isEmpty() && (out.length()<temp.length())) {
				out =  out;
			}else {
				out = temp;
			}
		}		
		return out;
	}
	
	public static String longestPrefix(String s1, String s2) {
		String pref = "";
		if(s1.length() > s2.length()) {
			for(int i = 0; i<s2.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					return pref;
				}
				pref += s1.charAt(i);
			}
		}else {
			for(int i = 0; i<s1.length();i++) {
				if(s2.charAt(i)!=s1.charAt(i)) {
					return pref;
				}
				pref += s2.charAt(i);
			}			
		}
		return pref;
	}
}
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
