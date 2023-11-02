import java.util.HashMap;

public class jwelsNstones {

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels,stones));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int count=0;
		HashMap<Character, Integer> hs = new HashMap<>();
		for(int i=0;i<jewels.length();i++) {
			if(!hs.containsKey(jewels.charAt(i)))
				hs.put(jewels.charAt(i), 1);
		}		
		for(int i=0;i<stones.length();i++) {
			if(hs.containsKey(stones.charAt(i)))
				count++;
		}		
		return count;
    }
}

/*
 
Code

Testcase
Testcase
Result

771. Jewels and Stones
Easy
Topics
Companies
Hint
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/