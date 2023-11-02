import java.util.Stack;

public class revString {

	public static void main(String[] args) {
		String input = "NEFT/RTGS";
		char[] s = input.toCharArray();
		reverseString(s);
		System.out.println(rev(input));
	}

	public static String rev(String input) {
		String out = "";
		Stack<Character> stck = new Stack<>();
		
		for(int i = 0;i<input.length();i++) {
			stck.add(input.charAt(i));
		}
		out = "";
		for(int j = 0;j<input.length();j++) {
			out += stck.pop();
		}
		
		return out;
	}
	
	public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        
        	while(i<j) {
        		char c = s[i];
        		s[i] = s[j];
        		s[j] = c;
        		i++;
        		j--;
        	}
        	
        	for(char c : s) {
        		System.out.print(c+", ");
        	}
    }
	
}
