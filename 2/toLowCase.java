
public class toLowCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		
//		String s = "here";
		System.out.println(toLowerCase(s));
	}
	
	    public static String toLowerCase(String s) {
	    	String out = "";
	    	
	    	for(int i = 0;i<s.length(); i++) {
	    		System.out.println((int)s.charAt(i)+"= "+(char)(int)s.charAt(i));
	    		if(s.charAt(i) >=65 &&  s.charAt(i)<=90){
	    			  s = s.replace(s.charAt(i), (char)(s.charAt(i)+32));
//	    			System.out.println((int)s.charAt(i));
//	    			out +=s.charAt(i);
	    		}
	    	}
	    	
//	    	for (char d : c) {
//				out += d;
//			}
	    	
	    	
	        return s;
	    }
	    
	    public static String toLowerCaseUsingCharArray(String s) {
	    	String out = "";
	    	char[] c = s.toCharArray();
	    	for(int i = 0;i<c.length; i++) {
	    		System.out.println((int)c[i]);
	    		if(c[i] >=65 &&  c[i]<=90){
	    			c[i] = (char)(c[i] + 32);
	    			System.out.println((int)c[i]);
	    		}
	    	}
	    	
	    	for (char d : c) {
				out += d;
			}
	    	
	    	
	        return out;
	    }

}
