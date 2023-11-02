import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		String input = "23";
		List<String> li = letterCombinations(input);
		System.out.println(li);
	}
	
	public static List<String> letterCombinations(String digits) {
		
		char[] d = digits.toCharArray();
		
		for (char c : d) {
			System.out.print(c+",");
		}
		
		String two = "abc";
		String three = "def";
		String four = "ghi";
		String five = "jkl";
		String six = "mno";
		String seven = "pqrs";
		String eight = "tuv";
		String nine = "wxyz";
		
       List<String> li = new LinkedList<String>();
       li.add("ljfjk");
		return li;
    }

}
