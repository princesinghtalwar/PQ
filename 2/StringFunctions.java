
public class StringFunctions {

	public static void main(String args0[]) {
		String input = "Prince";
		int rightShift =6;
		
		String output = rightShift(input,rightShift);
		System.out.println("Input :: "+input);
		System.out.println("Output :: "+output);

	}

	public static String rightShift(String s, int n) {
	    if (s == null || s.length() == 0) {
	        return s;
	    }
	    n = n % s.length(); // in case n is greater than string length
	    return s.substring(s.length() - n) + s.substring(0, s.length() - n);
	}
}
