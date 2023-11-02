import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

	public static void main(String[] args) {
		List<String> item = new ArrayList<>();
		List<String> item1 = new ArrayList<>();
		List<String> item2 = new ArrayList<>();
		List<List<String>> items = new ArrayList<>();

		String ruleKey = "color";
		String ruleValue = "silver";
		
		item.add("phone");
		item.add("blue");
		item.add("pixel");
		items.add(item);
		
		item1.add("computer");
		item1.add("silver");
		item1.add("lenovo");
		items.add(item1);
		
		item2.add("phone");
		item2.add("gold");
		item2.add("iphone");
		items.add(item2);
		
		System.out.println(countMatches(items,ruleKey,ruleValue));
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		int key = 0;
		if(ruleKey.equals("color"))
			key=1;
		else if(ruleKey.equals("name"))
			key=2;
			
		for (List<String> list : items) {
			System.out.println(list.get(key));
			if(list.get(key).equals(ruleValue))
				count++;
		}
		return count;
	}
	
//	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//		int count = 0;
//		int key = 0;
//		if(ruleKey =="color")
//			key=1;
//		else if(ruleKey =="name")
//			key=2;
//			
//		for (List<String> list : items) {
//			System.out.println(list.get(key));
//			if(list.get(key).equals(ruleValue))
//				count++;
//			for (String e : list) {
//				System.out.print(e+" ");
//			}
//			System.out.println();
//		}
//		return count;
//	}
	
}

/*
 You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 

Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
 */
