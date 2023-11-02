import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()))";
		
		System.out.println(isValid(s));

	}
	
	 public static boolean isValid(String s) {
			int len = s.length();
			boolean flag = false;
			if (len % 2 != 0)
				return false;
			
			Stack<Character> c = new Stack<Character>();
			HashMap<Character, Character> hm = new HashMap<Character, Character>();
			hm.put(')','(');
			hm.put('}','{');
			hm.put(']','[');
			
			for(int i = 0; i<len; i++) {
				if(isOpeningBracket(s.charAt(i))){
					c.push(s.charAt(i));
					flag = true;
				}else {
					if (!c.isEmpty()){
						if (c.peek() != hm.get(s.charAt(i)))
							flag = false;
					c.pop();   
	                }else {
	                	flag = false;
	                }
				}
			}
			if (flag)
				return c.isEmpty();
			else
				return flag;
		
		}
		
		public static boolean isOpeningBracket(char c) {
			char[] OpeningBrackets = {'(', '{', '['};
			
			for (char d : OpeningBrackets) {
				if(d==c)
					return true;
			}		
			return false;
		}
}
