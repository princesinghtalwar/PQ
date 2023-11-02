
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello world"));
	}
	
	 public static int lengthOfLastWord(String s) {
	        String[] as = s.split(" ");
	        return s.split(" ")[s.split(" ").length-1].length();
	    }

}
